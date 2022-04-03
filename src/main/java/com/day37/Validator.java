package com.day37;

/**
 * if we want to represent a group of strings according to a particular pattern then 
 * we should go for the regular expressions
 */
import java.util.regex.Pattern;

public class Validator {

	/**
	 * regex patterns for name, address, state,city, zipcode,mobile number and email
	 * id
	 */
	public String namePattern = "^[A-Z]{1}[A-Za-z]{2,}";
	public String addressPattern = "^[a-zA-Z0-9-, ]+";
	public String zipPattern = "^[0-9]{2,}";
	public String emailPattern = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9]+)*@([a-zA-Z0-9]+)([.][a-z]+)?[.][a-z]{2,}$";
	public String phoneNumberPattern = "^[0-9]{1,}[ ][1-9][0-9]{9}$";

	/**
	 * create a method to validate FirstName it is boolean data type method which
	 * means this method output must be true or false
	 * 
	 * @param firstName
	 * @return
	 * @throws NameValidationException
	 */
	public boolean validateFirstName(String firstName) throws NameValidationException {
		if (Pattern.matches(namePattern, firstName))
			return true;
		else
			throw new NameValidationException("Invalid First Name, Please enter valid first name");
	}

	/**
	 * create a method to validate LastName it is boolean data type method which
	 * means this method output must be true or false
	 * 
	 * @param lastName
	 * @return
	 * @throws NameValidationException
	 */
	public boolean validateLastName(String lastName) throws NameValidationException {
		if (Pattern.matches(namePattern, lastName))
			return true;
		else
			throw new NameValidationException("Invalid Last Name, Please enter valid last name");
	}

	/**
	 * create a method to validate Address it is boolean data type method which
	 * means this method output must be true or false
	 * 
	 * @param address
	 * @return
	 * @throws AddressValidationException
	 */
	public boolean validateAddress(String address) throws AddressValidationException {
		if (Pattern.matches(addressPattern, address))
			return true;
		else
			throw new AddressValidationException("Invalid Address, Please enter valid address");
	}

	/**
	 * create a method to validate city it is boolean data type method which means
	 * this method output must be true or false
	 * 
	 * @param city
	 * @return
	 * @throws NameValidationException
	 */
	public boolean validateCity(String city) throws NameValidationException {
		if (Pattern.matches(namePattern, city))
			return true;
		else
			throw new NameValidationException("Invalid City, Please enter valid city");
	}

	/**
	 * create a method to validate State it is boolean data type method which means
	 * this method output must be true or false
	 * 
	 * @param state
	 * @return
	 * @throws NameValidationException
	 */
	public boolean validateState(String state) throws NameValidationException {
		if (Pattern.matches(namePattern, state))
			return true;
		else
			throw new NameValidationException("Invalid State, Please enter valid state");
	}

	/**
	 * create a method to validate Zipcode it is boolean data type method which
	 * means this method output must be true or false
	 * 
	 * @param zip
	 * @return
	 * @throws ZipValidationException
	 */
	public boolean validateZip(String zip) throws ZipValidationException {
		if (Pattern.matches(zipPattern, zip))
			return true;
		else
			throw new ZipValidationException("Invalid Zip, Please enter valid zip");
	}

	/**
	 * create a method to validate Email id it is boolean data type method which
	 * means this method output must be true or false
	 * 
	 * @param email
	 * @return
	 * @throws EmailValidationException
	 */
	public boolean validateEmail(String email) throws EmailValidationException {
		if (Pattern.matches(emailPattern, email))
			return true;
		else
			throw new EmailValidationException("Invalid Email, Please enter valid email");
	}

	/**
	 * create a method to validate Phone Number it is boolean data type method which
	 * means this method output must be true or false
	 * 
	 * @param phoneNumber
	 * @return
	 * @throws PhoneNumberValidationException
	 */
	public boolean validatePhoneNumber(String phoneNumber) throws PhoneNumberValidationException {
		if (Pattern.matches(phoneNumberPattern, phoneNumber))
			return true;
		else
			throw new PhoneNumberValidationException("Invalid Phone Number, Please enter valid phone number");
	}
}
