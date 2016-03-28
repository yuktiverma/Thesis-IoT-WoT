package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrunUsernameUsingGroupId {
	String username[]=new String[100];
	public String[] returnuserNames(int groupId)
	{
		try
		{
		Connection con=SensorsDBConnect.returnConnectionObject();
		String query="Select username from groupuser where groupid="+groupId+"";
		Statement statement=con.createStatement();
		ResultSet rs=statement.executeQuery(query);
		//System.out.println(rs.getInt(1)+"gfff");
		int i=0;
		while(rs.next())
		{
			username[i]=rs.getString(1);
			//System.out.println(rs.getInt(1)+"gfff");
			i++;
		}
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		for(int k=0;k<username.length;k++)
		{
		System.out.println(username[k]+"username"+username.length);
		}
		return username;
		
	}

}
