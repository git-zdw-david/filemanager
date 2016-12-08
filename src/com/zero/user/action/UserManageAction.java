package com.zero.user.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserManageAction {
	
	@RequestMapping(value="initLogin.act",method=RequestMethod.GET)
	public String logininit(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		
		return "user/login";
	}
	
	@RequestMapping(value="login.act",method=RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		//model.addAttribute("success", "user login success.");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		request.getSession().setAttribute("username", username);
		
		return "redirect:../loadMainPage.act";
	}
	
	@RequestMapping(value="initRegist.act",method=RequestMethod.GET)
	public String initRegist(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		
		return "user/regist";
	}
	
	@RequestMapping(value="regist.act",method=RequestMethod.GET)
	public String regist(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		String username = request.getParameter("username");
		String nickname = request.getParameter("nickname");
		String password = request.getParameter("password");
		
		request.getSession().setAttribute("username", username);
		
		return "redirect:initLogin.act";
	}
	
	@RequestMapping(value="adduser.act",method=RequestMethod.GET)
	public String addUser(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		model.addAttribute("success", "user login success.");
		
		return "main";
	}
}
