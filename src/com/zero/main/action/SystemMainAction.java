package com.zero.main.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class SystemMainAction {
	
	
	
	@RequestMapping(value="/loadMainPage",method=RequestMethod.GET)
	public String loadMainPage(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		
		//response.setCharacterEncoding("utf-8");
		
		System.out.println("123s");
		
		//model.addAttribute("message", "Hello world , I'm david zhou.");
		
		return "main";
	}
	
	
}
