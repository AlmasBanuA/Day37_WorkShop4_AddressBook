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
 */

/**
 * importing Scanner class to take input from user
 */
import java.util.Scanner;

public class Executor {
	private static Scanner sc = new Scanner(System.in);
	static AddressBook addressBook;

	/**
	 * Main method for manipulation AddressBook
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		System.out.println("--------------------------------");
		AddressBookService addressBookService = new AddressBookService(sc);
		addressBook = new AddressBook();

		/**
		 * calling a method addressBookOptions to choose any options
		 */
		addressBookService.addressBookOptions(addressBook);
	}
}