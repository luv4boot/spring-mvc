package com.luv4boot.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luv4boot.springmvcorm.user.entity.User;
import com.luv4boot.springmvcorm.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	@RequestMapping("/showRegPage")
	public String showRegistrationPage() {
		return "register-user";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		int result = service.save(user);
		model.addAttribute("result", "User created with id " + result);
		return "register-user";
	}

	@RequestMapping("/list")
	public String listAllUsers(ModelMap model) {
		List<User> users = service.getAllUsers();
		model.addAttribute("users", users);
		return "list-users";
	}

	@RequestMapping("/validateUserId")
	public @ResponseBody String validateUserId(@RequestParam("id") int id) {
		User user = service.getOne(id);
		String msg = "";

		if (user != null) {
			msg = id + " already exists";
		}

		return msg;
	}
	
	@RequestMapping("/validateEmail")
	public @ResponseBody String validateEmail(@RequestParam("email") String email) {
		User user = service.getEmail(email);
		String msg = "";

		if (user != null) {
			msg = email + " already exists";
		}

		return msg;
	}

}
