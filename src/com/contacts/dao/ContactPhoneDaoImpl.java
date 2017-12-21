package com.contacts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.contacts.beans.ContactPhone;
import com.contacts.util.DatabaseUtil;

public class ContactPhoneDaoImpl implements ContactPhoneDao {
	
	public static String add_phone="insert into contacts.contact_phone values(null,?,?,now(),now())";

	@Override
	public boolean addPhoneno(ContactPhone phone) {
		// TODO Auto-generated method stub
		Connection con=DatabaseUtil.getConnection();
		try {
			for(String tmp_phone : phone.getPhonenumber())
			{
				PreparedStatement stmt=con.prepareStatement(ContactPhoneDaoImpl.add_phone);
				stmt.setLong(1,phone.getContactid());
				stmt.setString(2, tmp_phone);
				stmt.executeUpdate();
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public boolean deletePhoneno(long phoneid, long contactid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePhoneno(long phoneid, long contactid) {
		// TODO Auto-generated method stub
		return false;
	}

}
