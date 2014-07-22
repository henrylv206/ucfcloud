package com.ucfgroup.ucfcloud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Login controller
 *
 * @author HenryLv
 *
 * @since 2014-7-17 16:40
 */
@Controller
@RequestMapping("/login")
public class LoginController {
		
	/**
	 * login
	 * 
	 * @return
	 */
	@RequestMapping("/ajax/login")
	@ResponseBody
	public String login() {
		
		return "true";
	}
	
	/**
	 * Generate verify code
	 * 
	 * @return
	 */
	@RequestMapping("/ajax/generateVerifyCode")
	public String generateVerifyCode() {
		
		return null;
	}
	
	/**
	 * verify code
	 * 
	 * @return
	 */
	@RequestMapping("/ajax/verifyCode")
	@ResponseBody
	public String verifyCode(HttpServletRequest request, String code) {
		String result = "false";
		
		String verifyCode = (String) request.getSession().getAttribute("validateCode");
		
		if (verifyCode != null && verifyCode.equalsIgnoreCase(code)) {
			result = "true";
		}
						
		return result;
	}
}
