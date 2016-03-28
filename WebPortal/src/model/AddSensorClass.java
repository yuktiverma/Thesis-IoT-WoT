package model;

import java.sql.Connection;
import java.sql.Statement;

import beans.Sensor;
import beans.User;

public class AddSensorClass
{
	public boolean addSensor(Sensor sensor)
	{
		boolean status=true;
		
		Connection con=SensorsDBConnect.returnConnectionObject();
		//String insertTableSQL = "CREATE TABLE IF NOT EXISTS '"+sensor.getSensorName()+"'('"+sensor.getSensorFields()+"');";
		String insertTableSQL = "CREATE TABLE IF NOT EXISTS "+sensor.getSensorName()+"("+sensor.getSensorFields()+");";
		try
		{
		Statement statement = con.createStatement();
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
