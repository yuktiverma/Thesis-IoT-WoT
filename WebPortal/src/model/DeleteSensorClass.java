package model;

import java.sql.Connection;
import java.sql.Statement;

import beans.Sensor;


public class DeleteSensorClass {
	public boolean deleteSensor(Sensor sensor)
	{
		boolean status=true;
		
		Connection con=SensorsDBConnect.returnConnectionObject();
		String insertTableSQL = "Drop table "+sensor.getSensorName()+";";
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
