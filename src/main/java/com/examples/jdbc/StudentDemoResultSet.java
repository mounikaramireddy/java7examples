package com.examples.jdbc;

import java.sql.*;
import java.util.*;

class StudentDemoResultSet {
	public static void main(String arg[]) {
		StudentDemoResultSet ob = new StudentDemoResultSet();
		Connection con = null;
		ResultSet rs = null;
		Statement smt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "SCOTT", "Scott123");
			smt = con.createStatement();
			List<StudentDemo> l1 = ob.retrieveStudents(smt, rs);
			ob.printData(l1);
		} catch (Exception e) {
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

	private List<StudentDemo> retrieveStudents(Statement smt, ResultSet rs) throws Exception {
		List<StudentDemo> l = new ArrayList<>();
		rs = smt.executeQuery("select sname,sid,sbranch,scollege,semail,smarks,addressid from Studentdemo");
		while (rs.next()) {
			StudentDemo s = new StudentDemo();
			s.setName(rs.getString(1));
			s.setId(rs.getInt(2));
			s.setBranch(rs.getString(3));
			s.setClg(rs.getString(4));
			s.setEmail(rs.getString(5));
			s.setMarks(rs.getInt(6));
			s.setAddressid(rs.getInt(7));
			l.add(s);
		}
		return l;
	}

	void printData(List<StudentDemo> l1) {
		System.out.println("name   id    branch  clg  email  marks  addressid");
		for (StudentDemo s2 : l1) {
			System.out.println(s2.getName() + "\t" + s2.getId() + "\t" + s2.getBranch() + "\t" + s2.getClg() + "\t"
					+ s2.getEmail() + "\t" + s2.getMarks() + "\t" + s2.getAddressid());
		}
	}
}