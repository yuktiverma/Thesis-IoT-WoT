package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import beans.Group;
import beans.User;

public class AddGroupClass {
	public boolean addGroup(Group group)
	{
		boolean status=true;
		//DBConnect dbCon=new DBConnect();
		Connection con=SensorsDBConnect.returnConnectionObject();
		String insertTableSQL = "INSERT INTO groups (groupName) VALUES ('"+group.getGroupName()+"');";
		try
		{
		Statement statement = con.createStatement();
		status=statement.execute(insertTableSQL);
		
			
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return status;
	}

}
