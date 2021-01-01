package com.ruoyi.project.money.computer.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.money.computer.mapper.ComputerMapper;
import com.ruoyi.project.money.computer.domain.Computer;
import com.ruoyi.project.money.computer.service.IComputerService;
import com.ruoyi.project.tool.ComputerControlUtil;
import com.ruoyi.common.utils.security.ShiroUtils;
import com.ruoyi.common.utils.text.Convert;

/**
 * 电脑管理Service业务层处理
 * 
 * @author kong-lh
 * @date 2020-12-28
 */
@Service
public class ComputerServiceImpl implements IComputerService {
	@Autowired
	private ComputerMapper computerMapper;

	/**
	 * 查询电脑管理
	 * 
	 * @param ip 电脑管理ID
	 * @return 电脑管理
	 */
	@Override
	public Computer selectComputerById(String ip) {
		return computerMapper.selectComputerById(ip);
	}

	/**
	 * 查询电脑管理列表
	 * 
	 * @param computer 电脑管理
	 * @return 电脑管理
	 */
	@Override
	public List<Computer> selectComputerList(Computer computer) {
		return computerMapper.selectComputerList(computer);
	}

	/**
	 * 开启教室内全部电脑
	 * 
	 * @param computer 电脑管理
	 * @return 电脑管理
	 */
	@Override
	public boolean startUpByClassroom(String classroomid) {
		try {
			Computer computerParam = new Computer();
			computerParam.setClassroomid(classroomid);
			List<Computer> computerList = computerMapper.selectComputerList(computerParam);
			for (Computer computer : computerList) {
				String strMac = computer.getMac();
				String strIp = computer.getIp();
				ComputerControlUtil.startUp(strMac, strIp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 新增电脑管理
	 * 
	 * @param computer 电脑管理
	 * @return 结果
	 */
	@Override
	public int insertComputer(Computer computer) {
		computer.setCreuser(ShiroUtils.getLoginName());
		computer.setCreateTime(new Date());
		return computerMapper.insertComputer(computer);
	}

	/**
	 * 修改电脑管理
	 * 
	 * @param computer 电脑管理
	 * @return 结果
	 */
	@Override
	public int updateComputer(Computer computer) {
		computer.setUpduser(ShiroUtils.getLoginName());
		computer.setUpdtime(new Date());
		return computerMapper.updateComputer(computer);
	}

	/**
	 * 删除电脑管理对象
	 * 
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteComputerByIds(String ids) {
		return computerMapper.deleteComputerByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除电脑管理信息
	 * 
	 * @param ip 电脑管理ID
	 * @return 结果
	 */
	@Override
	public int deleteComputerById(String ip) {
		return computerMapper.deleteComputerById(ip);
	}
}
