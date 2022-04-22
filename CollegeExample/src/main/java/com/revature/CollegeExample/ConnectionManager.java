package com.revature.CollegeExample;

import java.sql.Connection;
import java.sql.DriverManager;

//this is the class where we make a connection to the database
public class ConnectionManager {
	
	private static Connection connection;
	
	private static String connectionString = "jdbc:postgresql://salt.db.elephantsql.com:5432/cdzhxsly",
			username = "cdzhxsly",
			password = "xIPDoshAtjPDMuI1BptjSdXQvk_cu1e2";
	
	public static Connection getConnection() {
		//will not compile without try-catch block
		try {
			if (connection == null || connection.isClosed()) {
				//ensures that driver class is loaded
				Class.forName("org.postgresql.Driver");
				//this is where the magic happens
				connection = DriverManager.getConnection(connectionString, username, password);
			}
			return connection;
		} catch (Exception e) {
			
		} return null;
	}

}
