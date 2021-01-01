package com.ruoyi.project.money.building.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.money.building.domain.Building;
import com.ruoyi.project.money.building.service.IBuildingService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 教学楼管理Controller
 * 
 * @author kong-lh
 * @date 2020-12-28
 */
@Controller
@RequestMapping("/money/building")
public class BuildingController extends BaseController
{
    private String prefix = "money/building";

    @Autowired
    private IBuildingService buildingService;

    @RequiresPermissions("money:building:view")
    @GetMapping()
    public String building()
    {
        return prefix + "/building";
    }

    /**
     * 查询教学楼管理列表
     */
    @RequiresPermissions("money:building:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Building building)
    {
        startPage();
        List<Building> list = buildingService.selectBuildingList(building);
        return getDataTable(list);
    }

    /**
     * 导出教学楼管理列表
     */
    @RequiresPermissions("money:building:export")
    @Log(title = "教学楼管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Building building)
    {
        List<Building> list = buildingService.selectBuildingList(building);
        ExcelUtil<Building> util = new ExcelUtil<Building>(Building.class);
        return util.exportExcel(list, "building");
    }

    /**
     * 新增教学楼管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存教学楼管理
     */
    @RequiresPermissions("money:building:add")
    @Log(title = "教学楼管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Building building)
    {
        return toAjax(buildingService.insertBuilding(building));
    }

    /**
     * 修改教学楼管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Building building = buildingService.selectBuildingById(id);
        mmap.put("building", building);
        return prefix + "/edit";
    }

    /**
     * 修改保存教学楼管理
     */
    @RequiresPermissions("money:building:edit")
    @Log(title = "教学楼管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Building building)
    {
        return toAjax(buildingService.updateBuilding(building));
    }

    /**
     * 删除教学楼管理
     */
    @RequiresPermissions("money:building:remove")
    @Log(title = "教学楼管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(buildingService.deleteBuildingByIds(ids));
    }
}
