/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.modules.sys.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wechat.common.persistence.Page;
import com.wechat.common.web.BaseController;
import com.wechat.modules.sys.entity.Log;
import com.wechat.modules.sys.service.LogService;

/**
 * 日志Controller
 * @author iwechat
 * @version 2017-6-2
 */
@Controller
@RequestMapping(value = "${adminPath}/sys/log")
public class LogController extends BaseController {

	@Autowired
	private LogService logService;
	
	@RequiresPermissions("sys:log:view")
	@RequestMapping(value = {"list", ""})
	public String list(Log log, HttpServletRequest request, HttpServletResponse response, Model model) {
        Page<Log> page = logService.findPage(new Page<Log>(request, response), log); 
        model.addAttribute("page", page);
		return "modules/sys/logList";
	}

}
