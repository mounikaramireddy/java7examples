package com.examples.jdbc;

import java.sql.*;

class StatementDmlEx1 {
	public static void main(String arg[]) {
		Connection con = null;
		Statement smt = null;
		StatementDmlEx1 ob = new StatementDmlEx1();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "SCOTT", "Scott123");
			smt = con.createStatement();
			ob.insertRow(smt);
			ob.updateRow(smt);
			ob.deleteRow(smt);
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				smt.close();
				con.close();
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}

	void insertRow(Statement smt) throws Exception {
		smt.executeUpdate("insert into StudentDemo(sid,sname,smarks,addressid) values(1,'kiran',1000,12345)");
		System.out.println("row inserted");
	}

	void updateRow(Statement smt) throws Exception {
		smt.executeUpdate("update studentDemo set smarks=990 where sid=1");
		System.out.println("row updated");

	}

	void deleteRow(Statement smt) throws Exception {
		smt.executeUpdate("delete studentDemo where sid=1");
		System.out.println("row deleted");

	}
}