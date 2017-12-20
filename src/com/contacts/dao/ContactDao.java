package com.contacts.dao;

import com.contacts.beans.Contact;

public interface ContactDao {
	
	long addContact(Contact contact);
	boolean updateContact(Contact contact);
	boolean deleteContact(long contactid);

}
