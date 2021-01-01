package com.ruoyi.project.money.classroom.controller;

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
import com.ruoyi.project.money.classroom.domain.Classroom;
import com.ruoyi.project.money.classroom.service.IClassroomService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 教室管理Controller
 * 
 * @author kong-lh
 * @date 2020-12-27
 */
@Controller
@RequestMapping("/money/classroom")
public class ClassroomController extends BaseController
{
    private String prefix = "money/classroom";

    @Autowired
    private IClassroomService classroomService;

    @RequiresPermissions("money:classroom:view")
    @GetMapping()
    public String classroom()
    {
        return prefix + "/classroom";
    }

    /**
     * 查询教室管理列表
     */
    @RequiresPermissions("money:classroom:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Classroom classroom)
    {
        startPage();
        List<Classroom> list = classroomService.selectClassroomList(classroom);
        return getDataTable(list);
    }

    /**
     * 导出教室管理列表
     */
    @RequiresPermissions("money:classroom:export")
    @Log(title = "教室管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Classroom classroom)
    {
        List<Classroom> list = classroomService.selectClassroomList(classroom);
        ExcelUtil<Classroom> util = new ExcelUtil<Classroom>(Classroom.class);
        return util.exportExcel(list, "classroom");
    }

    /**
     * 新增教室管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存教室管理
     */
    @RequiresPermissions("money:classroom:add")
    @Log(title = "教室管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Classroom classroom)
    {
        return toAjax(classroomService.insertClassroom(classroom));
    }

    /**
     * 修改教室管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Classroom classroom = classroomService.selectClassroomById(id);
        mmap.put("classroom", classroom);
        return prefix + "/edit";
    }

    /**
     * 修改保存教室管理
     */
    @RequiresPermissions("money:classroom:edit")
    @Log(title = "教室管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Classroom classroom)
    {
        return toAjax(classroomService.updateClassroom(classroom));
    }

    /**
     * 删除教室管理
     */
    @RequiresPermissions("money:classroom:remove")
    @Log(title = "教室管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(classroomService.deleteClassroomByIds(ids));
    }
}
