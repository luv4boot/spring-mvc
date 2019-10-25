package com.luv4boot.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.luv4boot.springmvc.dto.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/employee")
	public ModelAndView sendEmployee() {
		ModelAndView modelAndView = new ModelAndView();

		Employee employee = new Employee();
		employee.setId(1001);
		employee.setName("Kohli");
		employee.setSalary(15000);

		modelAndView.addObject("employee", employee);
		modelAndView.setViewName("displayEmployee");
		return modelAndView;
	}
}
