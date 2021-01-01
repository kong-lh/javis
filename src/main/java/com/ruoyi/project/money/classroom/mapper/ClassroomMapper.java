package com.ruoyi.project.money.classroom.mapper;

import java.util.List;
import com.ruoyi.project.money.classroom.domain.Classroom;

/**
 * 教室管理Mapper接口
 * 
 * @author kong-lh
 * @date 2020-12-27
 */
public interface ClassroomMapper 
{
    /**
     * 查询教室管理
     * 
     * @param id 教室管理ID
     * @return 教室管理
     */
    public Classroom selectClassroomById(Integer id);

    /**
     * 查询教室管理列表
     * 
     * @param classroom 教室管理
     * @return 教室管理集合
     */
    public List<Classroom> selectClassroomList(Classroom classroom);

    /**
     * 新增教室管理
     * 
     * @param classroom 教室管理
     * @return 结果
     */
    public int insertClassroom(Classroom classroom);

    /**
     * 修改教室管理
     * 
     * @param classroom 教室管理
     * @return 结果
     */
    public int updateClassroom(Classroom classroom);

    /**
     * 删除教室管理
     * 
     * @param id 教室管理ID
     * @return 结果
     */
    public int deleteClassroomById(Integer id);

    /**
     * 批量删除教室管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteClassroomByIds(String[] ids);
}
