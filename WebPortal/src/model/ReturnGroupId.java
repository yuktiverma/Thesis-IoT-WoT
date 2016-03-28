package model;

import java.sql.*;

public class ReturnGroupId {
	int groupId;
	public int returnId(String groupname)
	{
		try
		{
		Connection con=SensorsDBConnect.returnConnectionObject();
		String query="Select id from groups where groupname='"+groupname+"'";
		Statement statement=con.createStatement();
		ResultSet rs=statement.executeQuery(query);
		//System.out.println(rs.getInt(1)+"gfff");
		while(rs.next())
		{
			groupId=rs.getInt(1);
			System.out.println(rs.getInt(1)+"gfff");
		}
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return groupId;
		
	}
}
