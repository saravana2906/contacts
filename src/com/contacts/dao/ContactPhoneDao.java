package com.contacts.dao;

public interface ContactPhoneDao {
	boolean addPhoneno(String phoneno,long contactid);
	boolean deletePhoneno(long phoneid,long contactid);
	boolean updatePhoneno(long phoneid,long contactid);

}
