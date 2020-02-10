package com.examples.jdbc;

import java.sql.*;

public class DbConnection {
	public static void main(String[] arg) {
		DbConnection obj = new DbConnection();
		obj.connectDb();
	}

	void connectDb() {
		Connection con = null;
		try {
			Class c = Class.forName("oracle.jdbc.driver.OracleDriver");// step1:loading the driver
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "Scott123");
//step2:Establish connection
			System.out.println("connection established");
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}
}