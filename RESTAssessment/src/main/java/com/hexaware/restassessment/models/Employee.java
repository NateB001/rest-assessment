package com.hexaware.restassessment.models;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class Employee {
	
	@Size(min = 4, message = "Name should be at least 4 characters")
	private String name;
	
	@Email(message = "Please enter valid email")
	private String email;
	
	@DecimalMin(value = "1000.00", message = "Salary should be more than 1000")
	private double salary;

	public Employee() {
		super();
	}

	public Employee(@Size(min = 4, message = "Name should be at least 4 characters") String name,
			@Email(message = "Please enter valid email") String email,
			@DecimalMin(value = "1000.00", message = "Salary should be more than 1000") double salary) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
