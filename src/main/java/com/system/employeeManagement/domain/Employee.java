package com.system.employeeManagement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee_record")
@Getter
@Setter
public class Employee {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private long empId;
	
	@Column(name = "first_name")
	private String firsttName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "emp_email")
	private String email;
}
