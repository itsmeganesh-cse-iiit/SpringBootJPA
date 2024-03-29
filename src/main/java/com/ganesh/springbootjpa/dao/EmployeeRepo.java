package com.ganesh.springbootjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ganesh.springbootjpa.models.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Short>{
	//Returns list of Employees
	
	
	// Own method ? Variable should be in entity 
	List<Employee> findByLanguage(String language);
	
	List<Employee> findByEmpIdGreaterThan(short empId);
	
	// Complicated query
	
	@Query("from Employee where language=?1 order by empName")
	List<Employee> findByLanguageSorted(String language);
	
	

}
