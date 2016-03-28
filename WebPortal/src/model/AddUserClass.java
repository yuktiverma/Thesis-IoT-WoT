package model;

import java.sql.*;

import beans.User;



public class AddUserClass {
	public boolean addUser(User user)
	{
		boolean status=false;
		
		Connection con=DBConnect.returnConnectionObject();
		String insertTableSQL = "CREATE USER '"+user.getUsername()+"' IDENTIFIED BY '"+user.getPassword()+"';";
		try
		{
		Statement statement = con.createStatement();
		status=statement.execute(insertTableSQL);
			System.out.println(status);
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return status;
	}

}
