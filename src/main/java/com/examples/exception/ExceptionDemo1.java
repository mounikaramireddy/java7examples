package com.examples.exception;

class ExceptionDemo1 {
	public static void main(String args[]) {
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int z = (x / y);
			System.out.println(z);
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.err.println("please pass to argument");
		} catch (NumberFormatException ne) {
			System.err.println("please pass two intgers");
		} catch (ArithmeticException ae) {
			System.err.println("please pass second arg except zero");
		}
	}
}
