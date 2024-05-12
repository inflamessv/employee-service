package com.gfg.employeeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gfg.employeeapp.entity.Employee;
import com.gfg.employeeapp.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping(value = "/employee/{id}")
	private ResponseEntity<Employee>getEmployeeDetails(@PathVariable("id")Integer id ){	
		Employee emp=service.getById(id);
		return ResponseEntity.status(HttpStatus.OK).body(emp);		
	}

}
