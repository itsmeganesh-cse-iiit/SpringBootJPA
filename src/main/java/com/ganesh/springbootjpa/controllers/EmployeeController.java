package com.ganesh.springbootjpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping("/getEmployee")
	public ModelAndView getEmpployee(@RequestParam short empId) {
		ModelAndView mv = new ModelAndView("EmployeeDetails.jsp");
	
		System.out.println(repo.findByLanguage("C"));
		
		System.out.println(repo.findByEmpIdGreaterThan((short) 600));
		
		Employee employee = repo.findById(empId).orElse(new Employee());
		mv.addObject(employee);
		return mv;
	}
	// Need to implement update and delete operations
	// need to write own crud methods
}
