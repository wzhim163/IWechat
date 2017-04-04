/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.modules.interfaces.common;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.common.config.Global;
import com.wechat.common.utils.WechatDigestUtil;
import com.wechat.common.web.BaseController;

@Controller
@RequestMapping(value = "/interfaces/checkToken")
public class CheckTokenController extends BaseController {

	@RequestMapping(value = {"do", ""})
	@ResponseBody
	public String doCheck(HttpServletRequest request, HttpServletResponse response, Model model) {
		//微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
		String signature = request.getParameter("signature");
		//时间戳
		String timestamp = request.getParameter("timestamp");
		//随机数
		String nonce = request.getParameter("nonce");
		//随机字符串
		String echostr = request.getParameter("echostr");
		
		String[] arrTemp = {timestamp, nonce, Global.getWechatConfig("token")};
		//将token、timestamp、nonce三个参数进行字典序排序
		Arrays.sort(arrTemp);
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arrTemp.length; i++) {
			sb.append(arrTemp[i]);
		}
		//将三个参数字符串拼接成一个字符串进行sha1加密
		String pwd = WechatDigestUtil.getInstance().encipher(sb.toString());
		//开发者获得加密后的字符串可与signature对比，标识该请求来源于微信
		if(pwd != null && pwd.equals(signature)){
			return echostr;
		}else{
			return null;
		}
	}
}
