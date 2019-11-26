package com.ganesh.springbootjpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ganesh.springbootjpa.dao.EmployeeRepo;
import com.ganesh.springbootjpa.models.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("/")
	public String index()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee) {
		repo.save(employee);
		return "home.jsp";
	}

}
