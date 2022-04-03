package com.day37;

import java.util.ArrayList;

public class AddressBook {

	/**
	 * create an arraylist of contact
	 */
	private ArrayList<Contact> addressList = new ArrayList<Contact>();

	/**
	 * creating getter setter methods creating parameterized method named as
	 * setAddressList
	 * 
	 * @param addressList - person address list
	 */
	public void setAddressList(ArrayList<Contact> addressList) {
		this.addressList = addressList;
	}

	/**
	 * getting addresslist of contact using the arraylist
	 * 
	 * @return
	 */
	public ArrayList<Contact> getAddressList() {
		return addressList;
	}

	/**
	 * method to add contacts in addressBook
	 * 
	 * @param contact
	 */
	public void addContact(Contact contact) {
		addressList.add(contact);
	}

	/**
	 * method for search a contact by name
	 * 
	 * @param name
	 * @return
	 */
	public Contact searchByName(String name) {
		for (int i = 0; i < addressList.size(); ++i) {
			if (addressList.get(i).getName().contains(name))
				return addressList.get(i);
		}
		return null;
	}

	/**
	 * method to delete contact in the addressBook
	 * 
	 * @param name
	 * @return
	 */
	public boolean deleteContact(String name) {
		for (int i = 0; i < addressList.size(); ++i) {
			if (addressList.get(i).getName().equalsIgnoreCase(name)) {
				addressList.remove(i);
				return true;
			}
		}
		return false;
	}

	/**
	 * The java.lang.StringBuilder.append(boolean a) is an inbuilt method in Java
	 * which is used to append the string representation of the boolean argument to
	 * a given sequence.
	 * 
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();
		int count = 1;
		for (Contact contact : addressList) {
			if (contact != null) {
				str.append(count + ". " + contact.getFirstName() + " " + contact.getLastName() + "\n");
				count++;
			}
		}
		if (str.length() == 0)
			return "\nNo contact found";
		return str.toString();
	}
}
