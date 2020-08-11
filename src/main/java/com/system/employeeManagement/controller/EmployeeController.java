package com.system.employeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.system.employeeManagement.domain.Employee;
import com.system.employeeManagement.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@RequestMapping(value = "/fetchEmpRecords", method = RequestMethod.GET)
	public List<Employee> getEployee(){
		return employeeServiceImpl.getEmpRecords();
	}
	
	@RequestMapping(value = "/updateEmpRecord/{id}", method = RequestMethod.GET)
	public void updateEmpRecord(@PathVariable long id, @RequestParam("name") String firstName, @RequestParam("lastName") String lastName, @RequestParam("email") String email) {
		employeeServiceImpl.updateEmpRecord(id, firstName, lastName, email);
	}

}
