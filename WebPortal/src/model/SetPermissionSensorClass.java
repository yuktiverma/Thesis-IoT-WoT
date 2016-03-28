package model;

import java.sql.Connection;
import java.sql.Statement;

import beans.GroupSensor;

public class SetPermissionSensorClass {
	public boolean setPermission(GroupSensor groupSensor)
	{
		RetrunUsernameUsingGroupId returnUsename=new RetrunUsernameUsingGroupId();
		String usernames[]=returnUsename.returnuserNames(groupSensor.getGroupId());
		String permissions[]=groupSensor.getPermission();
		String sensorNames[]=groupSensor.getSensorName();
		Connection con=DBConnect.returnConnectionObject();
		Statement statement = null;
		boolean status=true;
		for(int j=0;j<sensorNames.length;j++)
		{
			if(permissions[j].equals("r"))
			{
		for(int i=0;i<usernames.length;i++)
		{
			try{
				 statement = con.createStatement();
				 status=statement.execute("GRANT SELECT ON sensors."+sensorNames[j]+" TO "+usernames[i]+";");
				 return status;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
			}
			else if(permissions[j].equals("rw"))
			{
		for(int i=0;i<usernames.length;i++)
		{
			try{
				 statement = con.createStatement();
				 status=statement.execute("GRANT ALL PRIVILEGES ON sensors."+sensorNames[j]+" TO "+usernames[i]+";");
				 return status;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
			}
		}
		return status;
	}

}
