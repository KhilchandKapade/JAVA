package com.jdbcOperation;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import com.mysql.cj.conf.ConnectionUrl.Type;
import com.mysql.cj.jdbc.CallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;


public class JdbcConnectivity {

	// JDBC  : Java DB connectivity 
	//used for doing operations in DB through java
	// follow the steps below:

	//Step 1: upload the driver
	//Step 2 : Connection using userName , password(DB), url(url of DB) 
	//Step 3: access the DB mentioned in the connection configuration to make changes in DB ->Statement class
	//Step 4 : write the query
	//Step 5: execute the query
	//Step 6: close the connection

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		//Step 1: upload the driver : https://dev.mysql.com/downloads/connector/j/

		// 2 : connection using useraname ,pass and url

		String userName = "root";
		String password = "Khil@123";
		String url = "jdbc:mysql://localhost:3306/USER_DETAILS";
		Connection conn =DriverManager.getConnection(url,userName,password);
		if(conn == null) {
			System.out.println("Database not connected");
		}
		else {
			System.out.println("Database  connected Successfully");
		}


		//Step 3: access the DB mentioned in the connection
		Statement st = conn.createStatement();

		//Step 4: write query
		String create = "CREATE TABLE APP(ID INT PRIMARY KEY AUTO_INCREMENT , APPNAME VARCHAR(250) , VERSION TEXT)";
		// DDL queries -> alter , rename , drop 
		//DML -> insert , update , delete

		//		String insert = "INSERT INTO  APP(APPNAME,VERSION) VALUES('WHATSAPP','V2.0.1') ,('INSTAGRAM','V1.0.0') ,('FACEBOOK','V0.0.1') ";
		//Step 5: execute the query
		//		boolean result = st.execute(insert);


		//dynamic query - take value from user(runtime from console)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the App name :");
		String appName = sc.nextLine();
		System.out.println("Enter the App version :");
		String version = sc.nextLine();


		//update , delete
		String insert = "INSERT INTO APP(APPNAME,VERSION)VALUE(?,?)";
		PreparedStatement pst = conn.prepareStatement(insert);
		pst.setString(1, appName);
		pst.setString(2, version);

		pst.execute();
		System.out.println("data inserted successfully");

		// Username , contact , email id -> registration -CRUD operation -console based
		// Create , insert , update , delete

		//reading the data from a table : SELECT

		String select = "SELECT * FROM APP";
		// use for DQL query use executeQuery()
		// resultset provide a pointer to target each row from the table
		
		ResultSet rs = st.executeQuery(select);
		while(rs.next()) {
			System.out.println("Id-" + rs.getInt("ID") +" AppName-" + rs.getString("APPNAME") +" Version-" + rs.getString("VERSION") );
		}

		System.out.println("-------------------------------------------");

		//Call statement: to call stored procedure in java from db
		
		String call = "{CALL getTotalAppCount(?)}";
		 CallableStatement clb = (CallableStatement) conn.prepareCall(call);
			clb.registerOutParameter(1, Types.INTEGER);
			clb.execute();
			
			int total = clb.getInt(1);
			System.out.println("Tatal Apps are: "+total);
			
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		

	}

}
