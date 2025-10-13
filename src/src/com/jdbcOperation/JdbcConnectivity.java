package com.jdbcOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectivity {

	//jdbc : java db  connectivity
	// uswee
	// step 1 : upload driver:

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub


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

		// 3: access the db
		Statement st = conn.createStatement();

		//4: write query
		String create = "CREATE TABLE APP(ID INT PRIMARY KEY AUTO_INCREMENT,NAME VARCHAR(50));";

		//STEP 5: EXECUTE THE QUERY
		boolean result = st.execute(create);
		System.out.println("Table Created succussfully");



	}

}
