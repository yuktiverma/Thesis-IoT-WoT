package model;

import java.sql.*;

public class  DBConnect {
	static Connection returnConnectionObject()
	{
		Connection conn=null;
		try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            
        } catch (Exception ex) {
            // handle the error
        	ex.printStackTrace();
        }
		return conn;
	}

}
