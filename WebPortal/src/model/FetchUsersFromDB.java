package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import beans.User;

public class FetchUsersFromDB {
	List<User> userList=new ArrayList<User>();
	User user=null;
	public List<User> fetchUsers()
	{
		
		Connection con=DBConnect.returnConnectionObject();
		String query="Select User from user";
		try
		{
		Statement statment=con.createStatement();
		ResultSet rs=statment.executeQuery(query);
		while(rs.next())
		{
			user=new User();
			user.setUsername(rs.getString(1));
			userList.add(user);
			System.out.println("userlist"+rs.getString(1));
		}
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return userList;
	}

}
