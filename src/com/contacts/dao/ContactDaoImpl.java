package com.contacts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.contacts.beans.Contact;
import com.contacts.util.DatabaseUtil;

public class ContactDaoImpl implements ContactDao {
	
	public static String insert_contact="insert into contacts.user_contact values(null,?,?,?,now(),now())";
	@Override
	public long addContact(Contact contact) {
		// TODO Auto-generated method stub
		Connection con=DatabaseUtil.getConnection();
		ResultSet generatedKeys=null;
		long contactid=0;
		try
		{
		PreparedStatement statement = con.prepareStatement(ContactDaoImpl.insert_contact,Statement.RETURN_GENERATED_KEYS);
		statement.setLong(1,contact.getUserid());
		statement.setString(2,contact.getName());
		statement.setString(3, contact.getEmailid());
		int updated=statement.executeUpdate();
		if(updated>0)
		{
			 generatedKeys = statement.getGeneratedKeys();
			 if (generatedKeys.next()) {
	                contactid=generatedKeys.getLong(1);
	            }
		}
		
	System.out.println("Contact ID"+ contactid);
		}
		catch(Exception e){
			
			e.printStackTrace();
			return 0;
			
		}
		
		return contactid;
	}

	@Override
	public boolean updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(long contactid) {
		// TODO Auto-generated method stub
		return false;
	}

}
