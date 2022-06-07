package com.hexaware.restassessment.models;

import java.util.ArrayList;
import java.util.List;

public class StatusMessage {
	
	private String status;
	
	private List<String> errors;

	public StatusMessage() {
		super();
		this.status = "VALID";
		this.errors = new ArrayList<>();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
}
