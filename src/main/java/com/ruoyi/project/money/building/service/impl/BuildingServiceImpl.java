package com.ruoyi.project.money.building.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.utils.security.ShiroUtils;
import com.ruoyi.common.utils.text.Convert;
import com.ruoyi.project.money.building.domain.Building;
import com.ruoyi.project.money.building.mapper.BuildingMapper;
import com.ruoyi.project.money.building.service.IBuildingService;

/**
 * 教学楼管理Service业务层处理
 * 
 * @author kong-lh
 * @date 2020-12-28
 */
@Service("building")
public class BuildingServiceImpl implements IBuildingService {
	@Autowired
	private BuildingMapper buildingMapper;

	/**
	 * 查询教学楼管理
	 * 
	 * @param id 教学楼管理ID
	 * @return 教学楼管理
	 */
	@Override
	public Building selectBuildingById(Long id) {
		return buildingMapper.selectBuildingById(id);
	}

	/**
	 * 查询教学楼管理列表
	 * 
	 * @param building 教学楼管理
	 * @return 教学楼管理
	 */
	@Override
	public List<Building> selectBuildingList(Building building) {
		return buildingMapper.selectBuildingList(building);
	}

	/**
	 * 查询教学楼管理列表
	 * 
	 * @param building 教学楼管理
	 * @return 教学楼管理
	 */
	@Override
	public List<Building> selectBuildingList() {
		return buildingMapper.selectBuildingList(null);
	}

	/**
	 * 新增教学楼管理
	 * 
	 * @param building 教学楼管理
	 * @return 结果
	 */
	@Override
	public int insertBuilding(Building building) {
		building.setCreuser(ShiroUtils.getLoginName());
		building.setCreateTime(new Date());
		return buildingMapper.insertBuilding(building);
	}

	/**
	 * 修改教学楼管理
	 * 
	 * @param building 教学楼管理
	 * @return 结果
	 */
	@Override
	public int updateBuilding(Building building) {
		building.setUpduser(ShiroUtils.getLoginName());
		building.setUpdtime(new Date());
		return buildingMapper.updateBuilding(building);
	}

	/**
	 * 删除教学楼管理对象
	 * 
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteBuildingByIds(String ids) {
		return buildingMapper.deleteBuildingByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除教学楼管理信息
	 * 
	 * @param id 教学楼管理ID
	 * @return 结果
	 */
	@Override
	public int deleteBuildingById(Long id) {
		return buildingMapper.deleteBuildingById(id);
	}
}
