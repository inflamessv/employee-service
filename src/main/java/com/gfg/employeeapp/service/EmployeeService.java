package com.gfg.employeeapp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gfg.employeeapp.entity.Employee;
import com.gfg.employeeapp.repository.EmployeeRepo;
import com.gfg.employeeapp.repository.IEmployee;

@Service
public class EmployeeService implements IEmployee{

	@Autowired
	private EmployeeRepo repository;
	
	@Override
	public Employee getById(Integer id) {
		Employee emp = repository.findById(id).orElseThrow(null);	    
		return emp;	
	}

	
}
