package com.zero.main.action;

import com.zero.main.dao.HelloworldDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/welcome")
public class HellworldController {

	@Autowired
	private HelloworldDao helloworldDao;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public ModelAndView printWelcome(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		model.addAttribute("username", "david");
		helloworldDao.sayHello();
		return new ModelAndView("main");
	}
}
