package com.examples.exception;

class UdException2 {
	public static void main(String ag[]) {
		try {
			String uname = ag[0];
			String psw = ag[1];
			Login l = new Login();
			l.checkLogin(uname, psw);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}