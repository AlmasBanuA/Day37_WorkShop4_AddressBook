package com.day37;

import java.util.Scanner;

public class ContactService {
	private Scanner sc;
	private AddressBook addressBook;
	private Validator validator;

	/**
	 * created parameterized constructor of ContactService class
	 * 
	 * @param sc
	 */
	public ContactService(Scanner sc) {
		this.sc = sc;
		this.addressBook = addressBook;
		this.validator = new Validator();
	}

	/**
	 * method to create contactPerson
	 * 
	 * @param contact
	 * @param sc
	 */
	public Contact createContact() {
		Contact contact = new Contact();
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
		return contact;
	}

	/**
	 * method to edit from the existing contact
	 * 
	 * @param contact
	 */
	public void editExistingContact(Contact contact) {
		while (true) {
			System.out.println("Options to update contact:");
			System.out.println(
					"1 (FirstName)\n2 (LastName)\n3 (Address)\n4 (City)\n5 (State)\n6 (Zip)\n7 (Phone)\n8 (Email)\n9 (Exit)");
			int options = Integer.parseInt(sc.nextLine());
			switch (options) {
			case 1:
				System.out.println("Enter New FirstName");
				String newFirstName = sc.nextLine();
				contact.setFirstName(newFirstName);
				break;
			case 2:
				System.out.println("Enter New LastName");
				String newLastName = sc.nextLine();
				contact.setLastName(newLastName);
				break;
			case 3:
				System.out.println("Enter New Address");
				String newAddress = sc.nextLine();
				contact.setAddress(newAddress);
				break;
			case 4:
				System.out.println("Enter New City");
				String newCity = sc.nextLine();
				contact.setCity(newCity);
				break;
			case 5:
				System.out.println("Enter State");
				String newState = sc.nextLine();
				contact.setState(newState);
				break;
			case 6:
				System.out.println("Enter New Zip");
				String newZip = sc.nextLine();
				contact.setZip(newZip);

				break;
			case 7:
				System.out.println("Enter New Phone");
				String newPhone = sc.nextLine();
				contact.setPhoneNumber(newPhone);
				break;
			case 8:
				System.out.println("Enter New Email");
				String newEmail = sc.nextLine();
				contact.setFirstName(newEmail);
				break;
			case 9:
				System.out.println("Exit");
				return;
			default:
				System.out.println("Invalid Entry");
				break;
			}
		}
	}

	/**
	 * method to display the contacts of addressBook
	 * 
	 * @param contact
	 */
	public void displayContact(Contact contact) {
		if (contact == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println(contact);
	}
}
