package com.examples.jdbc;

import java.sql.*;

class PreparedDmlEx1 {
	public static void main(String arg[]) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "SCOTT", "Scott123");
			PreparedDmlEx1 ob = new PreparedDmlEx1();
			ob.insertRow(con);
			ob.updateRow(con);
			ob.deleteRow(con);
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

	void insertRow(Connection con) throws Exception {
		PreparedStatement pre = con.prepareStatement("insert into StudentDemo(sid,smarks,sname) values(?,?,?)");
		pre.setInt(1, 2);
		pre.setInt(2, 990);
		pre.setString(3, "mouni");
		pre.executeUpdate();
		System.out.println("inserted successfully");
	}

	void updateRow(Connection con) throws Exception {
		PreparedStatement pre = con.prepareStatement("update studentdemo set smarks=? where sid=?");
		pre.setInt(1, 980);
		pre.setInt(2, 2);
		pre.executeUpdate();
		System.out.println("updated successfully");
	}

	void deleteRow(Connection con) throws Exception {
		PreparedStatement pre = con.prepareStatement("delete studentdemo where sid=?");
		pre.setInt(1, 2);
		pre.executeUpdate();
		System.out.println("deleted successfully");
	}
}