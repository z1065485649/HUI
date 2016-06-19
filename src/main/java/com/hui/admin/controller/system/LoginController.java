package com.hui.admin.controller.system;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
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
		if(null!=user)
		{
			Subject subject = SecurityUtils.getSubject();
			Session session = subject.getSession();
			String string = new SimpleHash("SHA-1",user.getAccount(),user.getPassword()).toString();	//密码加密
			System.out.println(string);
		}
		System.out.println(user.toString());
		return null;
	}
	
}
