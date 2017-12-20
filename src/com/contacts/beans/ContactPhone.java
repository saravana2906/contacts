package com.contacts.beans;

import java.util.List;

public class ContactPhone {
	List<String> phonenumber;
	long contactid;
	long phoneid;
	public List<String> getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(List<String> phonenumber) {
		this.phonenumber = phonenumber;
	}
	public long getContactid() {
		return contactid;
	}
	public void setContactid(long contactid) {
		this.contactid = contactid;
	}
	public long getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(long phoneid) {
		this.phoneid = phoneid;
	}

}
