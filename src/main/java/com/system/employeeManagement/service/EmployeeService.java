package com.system.employeeManagement.service;

import java.util.List;

import com.system.employeeManagement.domain.Employee;

public interface EmployeeService {

	public List<Employee> getEmpRecords();
	
	public void updateEmpRecord(long id, String firstName, String lastName, String email);
	
	public void updateEmpRecords(List<Employee> employeeList);
	
	public void addEmpRecord(String firstName, String lastName, String email);
	
	public void addEmpRecords(List<Employee> employeeList);
}
