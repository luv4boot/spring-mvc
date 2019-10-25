package com.luv4boot.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamsController {
	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("email") String email) {
		System.out.println("Id :" + id);
		System.out.println("Name :" + name);
		System.out.println("Email :" + email);
		return new ModelAndView("user-details");
	}
}
