package com.luv4boot.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("id",1001);
		modelAndView.addObject("name","Madhav");
		modelAndView.addObject("salary",15000);
		modelAndView.setViewName("hello");
		return modelAndView;
	}
}
