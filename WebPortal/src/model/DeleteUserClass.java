package model;

//import java.sql.PreparedStatement;
import java.sql.*;

import beans.User;

public class DeleteUserClass {
	public boolean deleteUser(User user)
	{
		boolean status=true;
		DBConnect dbCon=new DBConnect();
		Connection con=dbCon.returnConnectionObject();
		String insertTableSQL = "DROP USER '"+user.getUsername()+"';";
		try
		{
		Statement statement=con.createStatement();
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
