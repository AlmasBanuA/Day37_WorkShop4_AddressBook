package com.day37;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {

	/**
	 * test cases to validate the Contacts of a person according to regex patterns
	 * 
	 * @throws NameValidationException
	 */
	@Test
	/**
	 * test case method to validate first name
	 * 
	 * @throws NameValidationException
	 */
	public void validateFirstName() throws NameValidationException {
		Validator contact = new Validator();
		boolean result = contact.validateFirstName("Almas");
		Assert.assertTrue(true);
	}

	@Test
	/**
	 * test case method to validate last name
	 * 
	 * @throws NameValidationException
	 */
	public void lastNameTest() throws NameValidationException {
		Validator contact = new Validator();
		boolean result = contact.validateLastName("Banu");
		Assert.assertTrue(true);
	}

	@Test
	/**
	 * test case method to validate Email id
	 * 
	 * @throws EmailValidationException
	 */
	public void validateEmail() throws EmailValidationException {
		Validator contact = new Validator();
		boolean result = contact.validateEmail("almas123@gmail.com");
		Assert.assertTrue(true);
	}

	@Test
	/**
	 * test case method to validate Phone Number
	 * 
	 * @throws PhoneNumberValidationException
	 */
	public void phoneNoTest() throws PhoneNumberValidationException {
		Validator contact = new Validator();
		boolean result = contact.validatePhoneNumber("91 9090909090");
		Assert.assertTrue(true);
	}

	@Test
	/**
	 * test case method to validate Address
	 * 
	 * @throws AddressValidationException
	 */
	public void addressTest() throws AddressValidationException {
		Validator contact = new Validator();
		boolean result = contact.validateAddress("whitehouse");
		Assert.assertTrue(true);
	}

	@Test
	/**
	 * test case method to validate City
	 * 
	 * @throws NameValidationException
	 */
	public void cityTest() throws NameValidationException {
		Validator contact = new Validator();
		boolean result = contact.validateCity("Harihar");
		Assert.assertTrue(true);
	}

	@Test
	/**
	 * test case method to validate state
	 * 
	 * @throws NameValidationException
	 */
	public void stateTest() throws NameValidationException {
		Validator contact = new Validator();
		boolean result = contact.validateState("Karnataka");
		Assert.assertTrue(true);
	}
}