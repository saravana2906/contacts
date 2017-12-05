package com.contacts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.contacts.beans.User;
import com.contacts.util.DatabaseUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		Connection con=DatabaseUtil.getConnection();
		String addUserQuery="insert into users values(null,?,?,?,?,now(),now());";
		try
		{
		PreparedStatement statement = con.prepareStatement(addUserQuery);
		statement.setString(1, user.getUsername());
		statement.setString(2, user.getPassword());
		statement.setString(3, user.getEmailid());
		statement.setString(4, user.getPhoneno());
		int rows=statement.executeUpdate();
		
	System.out.println("Rows inserted : "+ rows);
		}
		catch(Exception e){
			
			e.printStackTrace();
			return false;
			
		}
		
		
		return true;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
