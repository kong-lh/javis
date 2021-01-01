package com.ruoyi.project.money.computer.mapper;

import java.util.List;
import com.ruoyi.project.money.computer.domain.Computer;

/**
 * 电脑管理Mapper接口
 * 
 * @author kong-lh
 * @date 2020-12-28
 */
public interface ComputerMapper 
{
    /**
     * 查询电脑管理
     * 
     * @param ip 电脑管理ID
     * @return 电脑管理
     */
    public Computer selectComputerById(String ip);

    /**
     * 查询电脑管理列表
     * 
     * @param computer 电脑管理
     * @return 电脑管理集合
     */
    public List<Computer> selectComputerList(Computer computer);

    /**
     * 新增电脑管理
     * 
     * @param computer 电脑管理
     * @return 结果
     */
    public int insertComputer(Computer computer);

    /**
     * 修改电脑管理
     * 
     * @param computer 电脑管理
     * @return 结果
     */
    public int updateComputer(Computer computer);

    /**
     * 删除电脑管理
     * 
     * @param ip 电脑管理ID
     * @return 结果
     */
    public int deleteComputerById(String ip);

    /**
     * 批量删除电脑管理
     * 
     * @param ips 需要删除的数据ID
     * @return 结果
     */
    public int deleteComputerByIds(String[] ips);
}
