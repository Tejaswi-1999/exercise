package com.del.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello.htm")
	public ModelAndView greet(@RequestParam("HELLO") String name) throws Exception	{
		ModelAndView mv = new ModelAndView("welcome","name",name);
	/*	//name of JSP page
		mv.setViewName("Welcome");
		
	//	data that you want to show on JSP in form of key and value
		mv.addObject("name",name);*/
		
		
		return mv;
		
		
	}


}
