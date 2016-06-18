package com.hui.admin.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hui.admin.constant.LoginResp;
import com.hui.admin.model.system.UserInfo;

@Controller
public class LoginController {
	@RequestMapping("/")
	public String welcome() {
		return "login";
	}
	
	/***
	 * 登陆
	 * @param user
	 * @return
	 */
	@RequestMapping("/user/login")
	@ResponseBody
	public LoginResp login(@RequestBody UserInfo user)
	{
		System.out.println(user.toString());
		return null;
	}
	
}
