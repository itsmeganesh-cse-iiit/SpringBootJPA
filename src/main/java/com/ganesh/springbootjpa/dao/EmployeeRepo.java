package com.ganesh.springbootjpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.ganesh.springbootjpa.models.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Short>{

}
