package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import beans.Group;
import beans.UserGroup;

public class AddUserGroupMapping {
	public int addUserGroup(UserGroup usergroup)
	{
		int status=0;
		String[] userName=usergroup.getUserName();
		int groupId=usergroup.getGroupId();
		//DBConnect dbCon=new DBConnect();
		System.out.println(groupId+"gid");
		Connection con=SensorsDBConnect.returnConnectionObject();
		String insertTableSQL = "INSERT INTO GROUPUSER(username,groupid) values (?,?)";
		try
		{
		for(int i=0; i<userName.length;i++)
		{
			//System.out.println("useriddd"+userId[i]);
		PreparedStatement preparedStatement = con.prepareStatement(insertTableSQL);
		preparedStatement.setString(1, userName[i]);
		preparedStatement.setInt(2, groupId);
		
			status=preparedStatement.executeUpdate();
			System.out.println(status);
		}
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return status;
	}

}
