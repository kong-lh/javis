package com.ruoyi.project.money.computer.controller;

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
import com.ruoyi.project.money.computer.domain.Computer;
import com.ruoyi.project.money.computer.service.IComputerService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 电脑管理Controller
 * 
 * @author kong-lh
 * @date 2020-12-28
 */
@Controller
@RequestMapping("/money/computer")
public class ComputerController extends BaseController {
	private String prefix = "money/computer";

	@Autowired
	private IComputerService computerService;

	@RequiresPermissions("money:computer:view")
	@GetMapping()
	public String computer() {
		return prefix + "/computer";
	}

	/**
	 * 查询电脑管理列表
	 */
	@RequiresPermissions("money:computer:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Computer computer) {
		startPage();
		List<Computer> list = computerService.selectComputerList(computer);
		return getDataTable(list);
	}

	/**
	 * 导出电脑管理列表
	 */
	@RequiresPermissions("money:computer:export")
	@Log(title = "电脑管理", businessType = BusinessType.EXPORT)
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(Computer computer) {
		List<Computer> list = computerService.selectComputerList(computer);
		ExcelUtil<Computer> util = new ExcelUtil<Computer>(Computer.class);
		return util.exportExcel(list, "computer");
	}

	/**
	 * 新增电脑管理
	 */
	@GetMapping("/add")
	public String add() {
		return prefix + "/add";
	}

	/**
	 * 新增保存电脑管理
	 */
	@RequiresPermissions("money:computer:add")
	@Log(title = "电脑管理", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Computer computer) {
		return toAjax(computerService.insertComputer(computer));
	}

	/**
	 * 修改电脑管理
	 */
	@GetMapping("/edit/{ip}")
	public String edit(@PathVariable("ip") String ip, ModelMap mmap) {
		Computer computer = computerService.selectComputerById(ip);
		mmap.put("computer", computer);
		return prefix + "/edit";
	}

	/**
	 * 修改保存电脑管理
	 */
	@RequiresPermissions("money:computer:edit")
	@Log(title = "电脑管理", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Computer computer) {
		return toAjax(computerService.updateComputer(computer));
	}

	/**
	 * 删除电脑管理
	 */
	@RequiresPermissions("money:computer:remove")
	@Log(title = "电脑管理", businessType = BusinessType.DELETE)
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids) {
		return toAjax(computerService.deleteComputerByIds(ids));
	}
}
