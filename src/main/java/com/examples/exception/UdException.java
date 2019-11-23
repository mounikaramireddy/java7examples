package com.examples.exception;

class UdException {
	public static void main(String arg[]) {
		try {
			EmpSal e = new EmpSal();
			String sal = arg[0];
			e.decidesal(sal);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}