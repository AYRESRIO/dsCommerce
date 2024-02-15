package com.devsuperior.dscommerece.controllers.handlers;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.devsuperior.dscommerece.dto.CustomError;
import com.devsuperior.dscommerece.dto.FieldMessage;

public class ValidationError extends CustomError {

	private List<FieldMessage> errors = new ArrayList<>();
	
	public ValidationError(Instant timestamp, Integer status, String error, String trace) {
		super(timestamp, status, error, trace);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}
	
	public void addError(String fieldName, String message) {
		errors.removeIf(x -> x.getFieldName().equals(fieldName));
		errors.add(new FieldMessage(fieldName, message));
	}
}
