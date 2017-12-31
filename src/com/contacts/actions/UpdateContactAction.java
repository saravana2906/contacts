package com.contacts.actions;

import com.contacts.beans.Contact;
import com.contacts.beans.ContactPhone;
import com.contacts.dao.ContactDao;
import com.contacts.dao.ContactDaoImpl;
import com.contacts.dao.ContactPhoneDao;
import com.contacts.dao.ContactPhoneDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateContactAction extends ActionSupport {

	/**
	 * 
	 */
	private long contactid;
	private static final long serialVersionUID = 1L;
	private Contact contact;
	private ContactPhone cphone;
	
	public String createForm() throws Exception
	{
		System.out.println("In Create Form");
		ContactDao cdao=new ContactDaoImpl();
		this.contact=cdao.getContact(contactid);
		ContactPhoneDao cpdao=new ContactPhoneDaoImpl();
		this.cphone=cpdao.getPhoneno(contactid);
		System.out.println(contact.getName() +"  "+contact.getEmailid() + " "+contact.getContactid());
		for(int i=0;i<cphone.getPhoneid().size();i++)
		{
			System.out.println(cphone.getPhoneid().get(i)+"  "+cphone.getPhonenumber().get(i));
		}
		
		return SUCCESS;
	}

	public long getContactid() {
		return contactid;
	}

	public void setContactid(long contactid) {
		this.contactid = contactid;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public ContactPhone getCphone() {
		return cphone;
	}

	public void setCphone(ContactPhone cphone) {
		this.cphone = cphone;
	}

}
