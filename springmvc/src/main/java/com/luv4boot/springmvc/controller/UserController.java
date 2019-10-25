package com.luv4boot.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luv4boot.springmvc.dto.User;

@Controller
public class UserController {

	/*
	 * @RequestMapping("/register") public ModelAndView showRegisterUserPage() {
	 * ModelAndView modelAndView = new ModelAndView();
	 * modelAndView.setViewName("user-register"); return modelAndView; }
	 */
	/*
	 * @RequestMapping(value = "/registerUser", method = RequestMethod.POST) public
	 * ModelAndView registerUser(@ModelAttribute("user") User user) { ModelAndView
	 * modelAndView = new ModelAndView(); modelAndView.addObject("user", user);
	 * modelAndView.setViewName("user-details"); return modelAndView; }
	 */

	@RequestMapping("/register")
	public String showRegisterUserPage() {
		return "user-register";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		model.addAttribute("user", user);
		return "user-details";
	}

}
