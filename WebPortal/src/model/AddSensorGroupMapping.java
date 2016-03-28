package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import beans.GroupSensor;
import beans.UserGroup;

public class AddSensorGroupMapping {
	public int addGroupSensors(GroupSensor groupSensor)
	{
		int status=0;
		String[] sensorName=groupSensor.getSensorName();
		int groupId=groupSensor.getGroupId();
		String[] permissions=groupSensor.getPermission();
		//DBConnect dbCon=new DBConnect();
		System.out.println(groupId+"gid");
		Connection con=SensorsDBConnect.returnConnectionObject();
		String insertTableSQL = "INSERT INTO GROUPSENSOR(sensorname,group_id,permission) values (?,?,?)";
		
		try
		{
		for(int i=0; i<sensorName.length;i++)
		{
			//System.out.println("useriddd"+userId[i]);
		PreparedStatement preparedStatement = con.prepareStatement(insertTableSQL);
		preparedStatement.setString(1, sensorName[i]);
		preparedStatement.setInt(2, groupId);
		preparedStatement.setString(1, permissions[i]);
		
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
