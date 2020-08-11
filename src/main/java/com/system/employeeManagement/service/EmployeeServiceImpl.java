package com.system.employeeManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.employeeManagement.domain.Employee;
import com.system.employeeManagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getEmpRecords() {
		return employeeRepository.findAll();
	}

	@Override
	public void updateEmpRecord(long id, String firstName, String lastName, String email) {

		List<Employee> employeeList = employeeRepository.findAll();

		Employee employee = new Employee();
		employee.setEmpId(id);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setEmail(email);
		
		employeeList.add(employee);
		employeeRepository.saveAll(employeeList);
	}
	
}
