package com.day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MultipleAddressBook {
	/**
	 * create a HashMap which is having key and value pair the key must be String
	 * type and value must be AddressBook
	 */
	private HashMap<String, AddressBook> addressBooks;

	/**
	 * create default constructor of MultipleAddressBook class
	 */
	public MultipleAddressBook() {
		this.addressBooks = new HashMap<String, AddressBook>();
	}

	/**
	 * create a method addAddressBook to add the new addressBook which is a unique
	 * type
	 * 
	 * @param addressBook - store information
	 */
	public void addAddressBook(AddressBook addressBook) {

		addressBooks.put(addressBook.getName(), addressBook);
	}

	/**
	 * create a method searchAddressBook which is parameterized type
	 * 
	 * @param name
	 * @return -return to method created
	 */
	public AddressBook searchAddressBook(String name) {
		for (String key : addressBooks.keySet()) {
			if (key.equalsIgnoreCase(name)) {
				return addressBooks.get(key);
			}
		}
		return null;
	}
	/**
	 * method to search a person by city created in the arraylist of contact
	 * @param city
	 * @return
	 */
	public List<Contact> searchByCity(String city) {
		List<Contact> list = new ArrayList<Contact>();
		for (Map.Entry entry : addressBooks.entrySet()) {
			List<Contact> contactList = ((AddressBook) entry.getValue()).searchByCity(city);
			for (Contact contact : contactList) {
				list.add(contact);
			}
		}
		return list.stream().filter(contact -> contact != null).distinct().collect(Collectors.toList());
	}
	
	/**
	 * method to search a person by State created in the arraylist of contact
	 * @param state
	 * @return
	 */
	public List<Contact> searchByState(String state) {
		List<Contact> list = new ArrayList<Contact>();
		for (Map.Entry entry: addressBooks.entrySet()) {
			List<Contact> contactList = ((AddressBook)entry.getValue()).searchByState(state);
			for (Contact contact: contactList) {
				list.add(contact);
			}
		}
		return list.stream().filter(contact->contact!= null).distinct().collect(Collectors.toList());
	}
}
