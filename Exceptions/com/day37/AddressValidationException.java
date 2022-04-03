package com.day37;

public class AddressValidationException extends Exception {
	public AddressValidationException(String errorMessage) {
		super(errorMessage);
	}
}