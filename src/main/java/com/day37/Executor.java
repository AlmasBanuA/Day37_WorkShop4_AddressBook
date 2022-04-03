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
 * UC5:- Ability to add multiple person to Address Book
 * 
 * UC6:- Refactor to add multiple Address Book to the System. 
 * Each Address Book has a unique Name - Use Console to add new Address Book 
 * - Maintain Dictionary of Address Book Name
 * 
 */

/**
 * importing Scanner class to take input from user
 */
import java.util.Scanner;

public class Executor {

	/**
	 * method created to add the new addressBook which is unique type
	 * 
	 * @param addressBooks
	 * @param addressBookService
	 * @param sc                 - input from user
	 */
	public static void addNewAddressBook(MultipleAddressBook addressBooks, AddressBookService addressBookService,
			Scanner sc) {
		System.out.print("Enter Name:");
		String name;
		name = sc.nextLine();
		if (addressBooks.searchAddressBook(name) != null) {
			System.out.println("Already exist");
			return;
		}
		AddressBook addressBook = new AddressBook(name);

		/**
		 * calling method to add the new addressBook
		 */
		addressBooks.addAddressBook(addressBook);
		System.out.print("Added new Address Book\n");
	}

	/**
	 * method created to viewExisting addressBook which is already present
	 * 
	 * @param addressBooks
	 * @param addressBookService
	 * @param sc                 -input from user
	 */
	public static void viewExistingAddressBook(MultipleAddressBook addressBooks, AddressBookService addressBookService,
			Scanner sc) {
		System.out.print("Enter Name:");
		String name = sc.nextLine();
		AddressBook addressBook = addressBooks.searchAddressBook(name);
		if (addressBook != null) {
			addressBookService.addressBookOptions(addressBook);
			return;
		}
		System.out.print("No addres book found\n");
	}

	/**
	 * Main method for manipulation AddressBook
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		System.out.println("--------------------------------");
		Scanner sc = new Scanner(System.in);
		MultipleAddressBook addressBooks = new MultipleAddressBook();
		AddressBookService addressBookService = new AddressBookService(sc);

		boolean repeat = true;
		while (repeat) {
			System.out
					.println("Main Options:\n1 (Add new AddressBook)\n2 (View or open existing AddressBook)\n3 (Exit)");
			int option = Integer.parseInt(sc.nextLine());
			switch (option) {
			case 1:
				addNewAddressBook(addressBooks, addressBookService, sc);
				break;
			case 2:
				viewExistingAddressBook(addressBooks, addressBookService, sc);
				break;
			case 3:
				repeat = false;
				break;
			default:
				System.out.println("Invalid Entry");
			}
		}
	}
}
