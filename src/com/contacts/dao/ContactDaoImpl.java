package com.contacts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.contacts.beans.Contact;
import com.contacts.util.DatabaseUtil;

public class ContactDaoImpl implements ContactDao {
	
	public static String insert_contact="insert into contacts.user_contact values(null,?,?,?,now(),now())";
	public static String getAllContacts_query="select * from contacts.user_contact where user_id=? order by contact_id";
	public static String deleteContact="delete from contacts.user_contact where contact_id=?";
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
		Connection con=DatabaseUtil.getConnection();
		int count=0;
		try {
			PreparedStatement statement = con.prepareStatement(ContactDaoImpl.deleteContact);
			statement.setLong(1,contactid);
			count=statement.executeUpdate();
			System.out.println(count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		if(count>0)
		{
			return true;
		}
		return false;
	}

	@Override
	public List<Contact> getAllContacts(long userid) {
		// TODO Auto-generated method stub
		Connection con=DatabaseUtil.getConnection();
		List<Contact> contacts = new ArrayList<Contact>(); 
		System.out.println("In Dao");
		ResultSet rs=null;
		try
		{
		PreparedStatement statement = con.prepareStatement(ContactDaoImpl.getAllContacts_query);
		statement.setLong(1, userid);
		rs=statement.executeQuery();
		while(rs.next())
		{
			Contact tmpContact=new Contact();
			tmpContact.setContactid(rs.getLong(1));
			tmpContact.setName(rs.getString(3));
			tmpContact.setEmailid(rs.getString(4));
			contacts.add(tmpContact);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return contacts;
	}

}
