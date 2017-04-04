/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.modules.interfaces.test.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.common.web.BaseController;
import com.wechat.modules.interfaces.test.entity.InterfaceTest;

@Controller
@RequestMapping(value = "/interfaces/test")
public class InterfaceTestController extends BaseController {

	@RequestMapping(value = {"info", ""})
	@ResponseBody
	public InterfaceTest info(HttpServletRequest request, HttpServletResponse response, Model model) {
		InterfaceTest test = new InterfaceTest();
		
		test.setName("张三");
		test.setSax("男");
		
		return test;
	}
}
