package com.day37;

/**
 * import hashmap class
 */
import java.util.HashMap;

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
}
