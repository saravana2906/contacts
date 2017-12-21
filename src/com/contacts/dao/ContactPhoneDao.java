package com.contacts.dao;

import com.contacts.beans.ContactPhone;

public interface ContactPhoneDao {
	boolean addPhoneno(ContactPhone phone);
	boolean deletePhoneno(long phoneid,long contactid);
	boolean updatePhoneno(long phoneid,long contactid);

}
