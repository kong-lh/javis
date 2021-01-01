package com.ruoyi.project.monitor.job.task;

import org.springframework.stereotype.Component;

/**
 * 定时任务测试电脑状态
 * 
 * @author kong-lh
 */
@Component("ComputerStatusTask")
public class ComputerStatusTask {

	public void ping() {
		System.out.println("测试IP是否能连通");
	}
}
