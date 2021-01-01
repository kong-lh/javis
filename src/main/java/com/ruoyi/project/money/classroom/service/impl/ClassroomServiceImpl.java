package com.ruoyi.project.money.classroom.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.money.classroom.mapper.ClassroomMapper;
import com.ruoyi.project.money.classroom.domain.Classroom;
import com.ruoyi.project.money.classroom.service.IClassroomService;
import com.ruoyi.common.utils.security.ShiroUtils;
import com.ruoyi.common.utils.text.Convert;

/**
 * 教室管理Service业务层处理
 * 
 * @author kong-lh
 * @date 2020-12-27
 */
@Service("classroom")
public class ClassroomServiceImpl implements IClassroomService {
	@Autowired
	private ClassroomMapper classroomMapper;

	/**
	 * 查询教室管理
	 * 
	 * @param id 教室管理ID
	 * @return 教室管理
	 */
	@Override
	public Classroom selectClassroomById(Integer id) {
		return classroomMapper.selectClassroomById(id);
	}

	/**
	 * 查询教室管理列表
	 * 
	 * @param classroom 教室管理
	 * @return 教室管理
	 */
	@Override
	public List<Classroom> selectClassroomList(Classroom classroom) {
		return classroomMapper.selectClassroomList(classroom);
	}

	/**
	 * 查询教室管理列表
	 * 
	 * @param classroom 教室管理
	 * @return 教室管理
	 */
	@Override
	public List<Classroom> selectClassroomListByBuildingId(Integer buildingid) {
		Classroom classroom = new Classroom();
		classroom.setBuildingid(buildingid);
		return classroomMapper.selectClassroomList(classroom);
	}

	/**
	 * 新增教室管理
	 * 
	 * @param classroom 教室管理
	 * @return 结果
	 */
	@Override
	public int insertClassroom(Classroom classroom) {
		classroom.setCreuser(ShiroUtils.getLoginName());
		classroom.setCreateTime(new Date());
		return classroomMapper.insertClassroom(classroom);
	}

	/**
	 * 修改教室管理
	 * 
	 * @param classroom 教室管理
	 * @return 结果
	 */
	@Override
	public int updateClassroom(Classroom classroom) {
		classroom.setUpduser(ShiroUtils.getLoginName());
		classroom.setUpdtime(new Date());
		return classroomMapper.updateClassroom(classroom);
	}

	/**
	 * 删除教室管理对象
	 * 
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteClassroomByIds(String ids) {
		return classroomMapper.deleteClassroomByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除教室管理信息
	 * 
	 * @param id 教室管理ID
	 * @return 结果
	 */
	@Override
	public int deleteClassroomById(Integer id) {
		return classroomMapper.deleteClassroomById(id);
	}
}
