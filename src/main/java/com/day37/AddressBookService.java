package com.day37;

/**
 * importing Scanner class to take input from user
 */
import java.util.Objects;
import java.util.Scanner;

public class AddressBookService {
	private Scanner sc;
	private Validator validator;
	private ContactService contactService;
	private AddressBook addressBook;

	/**
	 * create a parameterized constructor named as AddressBookService
	 * 
	 * @param sc - input from user
	 */
	public AddressBookService(Scanner sc) {
		this.sc = sc;
		this.validator = new Validator();
	}

	/**
	 * method to find the contact in the addressBook
	 */
	public void findContact() {
		System.out.println("Enter Person Name");
		String name = sc.nextLine();
		contactService.displayContact(addressBook.searchByName(name));
	}

	/**
	 * method to Edit the contact in the addressBook
	 */
	public void editContact() {
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
	public void deleteContact() {
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
	public void createContact() {
		Contact contact = contactService.createContact();
		if (contact == null) {
			System.out.println("Already exist in Address Book");
			return;
		}
		addressBook.addContact(contact);
	}

	/**
	 * method to choose options of addressBook
	 * @param addressBook
	 */
	public void addressBookOptions(AddressBook addressBook) {
		this.addressBook = addressBook;
		contactService = new ContactService(sc);
		boolean repeat = true;
		while (repeat) {
			System.out.println(
					"\nAddress Book Options:\n1 (Add new contact)\n2 (Edit existing contact)\n3 (Delete a contact)\n4 (View all contact)\n5 (Display contact)\n6 Exit");
			int option = Integer.parseInt(sc.nextLine());

			/**
			 * switch case statement to choose any options
			 */
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
