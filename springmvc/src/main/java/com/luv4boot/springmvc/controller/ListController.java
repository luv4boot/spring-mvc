package com.luv4boot.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.luv4boot.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/listEmps")
	public ModelAndView listEmps() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("list-emp");
		Employee employee1 = new Employee();
		employee1.setId(1001);
		employee1.setName("Madhav");
		employee1.setSalary(15000);

		Employee employee2 = new Employee();
		employee2.setId(1002);
		employee2.setName("Kohli");
		employee2.setSalary(25000);

		Employee employee3 = new Employee();
		employee3.setId(1003);
		employee3.setName("Dhoni");
		employee3.setSalary(35000);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);

		modelAndView.addObject("employees", employees);
		return modelAndView;
	}
}
