package com.examples.exception;

class ExceptionDemo2 {
	public static void main(String args[]) {
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int z = x + y;
			System.out.println(z);
		} catch (NumberFormatException ne) {
			System.err.println("enter two integers");
		}
	}
}
