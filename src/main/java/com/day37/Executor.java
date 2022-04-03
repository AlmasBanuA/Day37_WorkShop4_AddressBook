package com.day37;

/**
 * UC1:- Ability to create a Contacts in Address Book with first and last names,
 * address, city, state, zip, phone number and email...
 */

/**
 * importing Scanner class to take input from user
 */
import java.util.Scanner;

import com.day37.Contact;
import com.day37.ContactService;

public class Executor {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Main method for manipulation AddressBook
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		System.out.println("--------------------------------");
		ContactService contactService = new ContactService(sc);
		Contact contact = new Contact();

		/**
		 * calling a method createPerson to take the input from console
		 */
		contactService.createPerson(contact, sc);
		System.out.println(contact);
	}
}
