package com.qa.garage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDqueries {

	//To carry out CRUD queries - where we connect to the the db
	//Four main things needed:
	// - open the connection
	// - write your query/statement - CRUD
	// - Execute query.
	// - close connection
	
	private Connection conn;//has a driver manager class which contains the methods to connect to db
	private Statement stmt;//allows us to prepare the query we want to execute
	
	//open connection in the constructor - initialises everything
	public CRUDqueries() {
		try {
			conn = DriverManager.getConnection(DBconfig.URL, DBconfig.USER, DBconfig.PASS);
			this.stmt = conn.createStatement();//create a statement object to execute sql queries
			System.out.println("Connection Successful!");
		}catch(SQLException e) {
			System.out.println("Incorrect credentials");
			e.printStackTrace();
		}
	}
	
	//close the connection
	public void closeConn() {
		try {
			conn.close();
			System.out.println("Closed!");
		}catch(SQLException e) {
			System.out.println("Closing connection...");
			e.printStackTrace();
		}
	}
	
	
	
}
