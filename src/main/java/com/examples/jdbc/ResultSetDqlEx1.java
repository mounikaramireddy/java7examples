package com.examples.jdbc;

import java.sql.*;

class ResultSetDqlEx1 {
	public static void main(String arg[]) {
		ResultSetDqlEx1 ob = new ResultSetDqlEx1();
		Connection con = null;
		ResultSet rs = null;
		Statement smt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "SCOTT", "Scott123");
			smt = con.createStatement();
			ob.retrieveStudentDemo(smt, rs);

		} catch (Exception e) {
			System.out.print("1catch ");

			System.err.println(e);
		} finally {
			try {
				if (null != rs) {
					rs.close();
				}
				if (null != smt) {
					smt.close();
				}
				if (null != con) {
					con.close();
				}
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}

	void retrieveStudentDemo(Statement smt, ResultSet rs) throws Exception {
		rs = smt.executeQuery("select sid,sname,smarks from studentDemo");
		while (rs.next()) {
			System.out.print(rs.getInt(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getInt(3));
			System.out.println();
		}
	}
}