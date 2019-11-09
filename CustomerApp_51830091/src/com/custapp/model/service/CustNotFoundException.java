package com.custapp.model.service;

@SuppressWarnings("serial")
public class CustNotFoundException extends RuntimeException {
	
	public CustNotFoundException(String message) {

		super(message);

	}

}
