package com.day37;

import java.util.Scanner;

public class ContactService {
	private Scanner sc;
	private Validator validator;

	/**
	 * created parameterized constructor of ContactService class
	 * 
	 * @param sc
	 */
	public ContactService(Scanner sc) {
		this.sc = sc;
		this.validator = new Validator();
	}

	/**
	 * method to create contactPerson
	 * 
	 * @param contact
	 * @param sc
	 */
	public void createPerson(Contact contact, Scanner sc) {
		String firstName, lastName, address, city, state, zip, email, phoneNumber;
		System.out.println("first name:");

		/**
		 * using try and catch block to handle the exceptions
		 */
		while (true) {
			try {
				firstName = sc.nextLine();
				
				/**
				 * calling a method to validate First Name it will check it will match or not if
				 * not matched then throws exception
				 */
				validator.validateFirstName(firstName);
				contact.setFirstName(firstName);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("last name:");
		while (true) {
			try {
				lastName = sc.nextLine();
				
				/**
				 * calling a method to validate Last Name it will check it will match or not if
				 * not matched then throws exception
				 */
				validator.validateLastName(lastName);
				contact.setLastName(lastName);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("address:");
		while (true) {
			try {
				address = sc.nextLine();

				/**
				 * calling a method to validate Address it will check it will match or not if
				 * not matched then throws exception
				 */
				validator.validateAddress(address);
				contact.setAddress(address);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("city:");
		while (true) {
			try {
				city = sc.nextLine();

				/**
				 * calling a method to validate City it will check it will match or not if not
				 * matched then throws exception
				 */
				validator.validateCity(city);
				contact.setCity(city);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("state:");
		while (true) {
			try {
				state = sc.nextLine();

				/**
				 * calling a method to validate State it will check it will match or not if not
				 * matched then throws exception
				 */
				validator.validateState(state);
				contact.setState(state);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("zip:");
		while (true) {
			try {
				zip = sc.nextLine();

				/**
				 * calling a method to validate zipcode it will check it will match or not if
				 * not matched then throws exception
				 */
				validator.validateZip(zip);
				contact.setZip(zip);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Phone Number:");
		while (true) {
			try {
				phoneNumber = sc.nextLine();

				/**
				 * calling a method to validate Phone Number it will check it will match or not
				 * if not matched then throws exception
				 */
				validator.validatePhoneNumber(phoneNumber);
				contact.setPhoneNumber(phoneNumber);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("email:");
		while (true) {
			try {
				email = sc.nextLine();

				/**
				 * calling a method to validate Email it will check it will match or not if not
				 * matched then throws exception
				 */
				validator.validateEmail(email);
				contact.setEmail(email);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("\nContact is added successfully\n");

	}
}
