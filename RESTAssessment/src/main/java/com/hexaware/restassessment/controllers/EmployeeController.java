package com.hexaware.restassessment.controllers;

import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.restassessment.models.Employee;
import com.hexaware.restassessment.models.StatusMessage;

@RestController("employeeController")
@RequestMapping("/employee")	//http://localhost:8080/employee
public class EmployeeController {
	
	@PostMapping(value = "/validate")
	public StatusMessage validateEmployee(@RequestBody Employee employee) {
		StatusMessage statusMessage = new StatusMessage();
		List<String> errors = new ArrayList<>();
		
		if(employee.getName().length() < 4 || !employee.getEmail().matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$") || employee.getSalary() < 1000) {
			statusMessage.setStatus("ERROR");
			
			if(employee.getName().length() < 4) {
				errors.add("Name should be at least 4 characters");
			}
			if(!employee.getEmail().matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")) {
				errors.add("Please enter valid email");
			}
			if(employee.getSalary() < 1000) {
				errors.add("Salary should be more than 1000");
			}
			
			statusMessage.setErrors(errors);
		}
		
		return statusMessage;
	}
}
