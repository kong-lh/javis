package com.ruoyi.project.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.money.computer.domain.Computer;
import com.ruoyi.project.money.computer.service.IComputerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 电脑管理Controller
 * 
 * @author kong-lh
 * @date 2020-12-28
 */
@Api("APP接口管理")
@RestController
@RequestMapping("/app")
public class AppController extends BaseController {
	@Autowired
	private IComputerService computerService;

	@ApiOperation("获取电脑列表")
	@PostMapping("/list")
	@ResponseBody
	public List<Computer> test(String ip) {
		List<Computer> list = computerService.selectComputerList(null);
		return list;
	}

	@ApiOperation("开启教室内全部电脑")
	@PostMapping("/startUpByClassroom")
	@ResponseBody
	public void startUpByClassroom(String classroomid) {
		computerService.startUpByClassroom(classroomid);
		AjaxResult.success();
	}

}
