package com.ruoyi.project.money.building.mapper;

import java.util.List;
import com.ruoyi.project.money.building.domain.Building;

/**
 * 教学楼管理Mapper接口
 * 
 * @author kong-lh
 * @date 2020-12-28
 */
public interface BuildingMapper 
{
    /**
     * 查询教学楼管理
     * 
     * @param id 教学楼管理ID
     * @return 教学楼管理
     */
    public Building selectBuildingById(Long id);

    /**
     * 查询教学楼管理列表
     * 
     * @param building 教学楼管理
     * @return 教学楼管理集合
     */
    public List<Building> selectBuildingList(Building building);

    /**
     * 新增教学楼管理
     * 
     * @param building 教学楼管理
     * @return 结果
     */
    public int insertBuilding(Building building);

    /**
     * 修改教学楼管理
     * 
     * @param building 教学楼管理
     * @return 结果
     */
    public int updateBuilding(Building building);

    /**
     * 删除教学楼管理
     * 
     * @param id 教学楼管理ID
     * @return 结果
     */
    public int deleteBuildingById(Long id);

    /**
     * 批量删除教学楼管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBuildingByIds(String[] ids);
}
