package com.contacts.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.contacts.forms.AddContactForm;
import com.contacts.forms.SignupForm;
import com.opensymphony.xwork2.ActionSupport;

public class AddContactAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> userSession ;
	
	private AddContactForm contactform;

	public AddContactForm getContactform() {
		return contactform;
	}

	public void setContactform(AddContactForm contactform) {
		this.contactform = contactform;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.userSession=session;
		
	}
	
	public String execute() throws Exception {
		
		
		return SUCCESS;
	}

}
