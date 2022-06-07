package com.hexaware.restassessment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.restassessment.models.ErrorMessage;

@RestController("exceptionController")
@RequestMapping("/api")	//http://localhost:8080/api
public class ExceptionController {
	
	@GetMapping(value = "/testExceptionHandling")
	public ErrorMessage TestExceptionHandling (@RequestParam String code) {
		ErrorMessage errorMessage = new ErrorMessage();
		
		if(code.equals("401")) {
			errorMessage.setErrorMessage("You are not authorized");
		} else if (code.equals("404")) {
			errorMessage.setErrorMessage("Resource not found");
		} else {
			errorMessage.setErrorMessage("");
		}
		
		return errorMessage;
	}

}
