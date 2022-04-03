package com.day37;

/**
 * UC1:- Ability to create a Contacts in Address Book with first and last names,
 * address, city, state, zip, phone number and email...
 * 
 * UC2:- Ability to add a new Contact to Address Book
 * 
 * UC3:- Ability to edit existing contact person using their name
 * 
 * UC4:- Ability to delete a person using person's name
 * 
 */

/**
 * importing Scanner class to take input from user
 */
import java.util.Objects;
import java.util.Scanner;

public class Executor {
	private static Scanner sc = new Scanner(System.in);
	static ContactService contactService;
	static AddressBook addressBook;

	/**
	 * method to find the contact in the addressBook
	 */
	public static void findContact() {
		System.out.println("Enter Person Name");
		String name = sc.nextLine();
		contactService.displayContact(addressBook.searchByName(name));
	}

	/**
	 * method to Edit the contact in the addressBook
	 */
	public static void editContact() {
		System.out.println("Enter Person Name");
		String name = sc.nextLine();
		Contact contact = addressBook.searchByName(name);
		if (Objects.nonNull(contact)) {
			contactService.editExistingContact(contact);
			return;
		}
		System.out.println("Person Not Found");
	}

	/**
	 * method to Delete the contact in the addressBook
	 */
	public static void deleteContact() {
		System.out.println("Enter Person Name");
		String name = sc.nextLine();
		if (Objects.nonNull(addressBook.searchByName(name))) {
			addressBook.deleteContact(name);
			return;
		}
		System.out.println("Person Not Found");
	}

	/**
	 * method to Create the contact in the addressBook
	 */
	public static void createContact() {
		addressBook.addContact(contactService.createContact());
	}

	/**
	 * Main method for manipulation AddressBook
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		System.out.println("--------------------------------");
		addressBook = new AddressBook();
		contactService = new ContactService(sc);

		boolean repeat = true;
		while (repeat) {
			System.out.println(
					"\nAddress Book Options:\n1 (Add new contact)\n2 (Edit existing contact)\n3 (Delete a contact)\n4 (View all contact)\n5 (Display contact)\n6 Exit");
			int option = Integer.parseInt(sc.nextLine());
			switch (option) {
			case 1:
				createContact();
				break;
			case 2:
				editContact();
				break;
			case 3:
				deleteContact();
				break;
			case 4:
				System.out.println(addressBook);
				break;
			case 5:
				findContact();
				break;
			case 6:
				repeat = false;
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid Entry");
			}
		}
	}
}
