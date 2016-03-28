package model;

import java.sql.*;

public class ReturnUserId {
	int userId;
	public int returnId(String username)
	{
		try
		{
		Connection con=DBConnect.returnConnectionObject();
		String query="Select user_id from users where user_name='"+username+"'";
		Statement statement=con.createStatement();
		ResultSet rs=statement.executeQuery(query);
		while(rs.next())
		{
			userId=rs.getInt(1);
		}
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return userId;
		
	}

}
