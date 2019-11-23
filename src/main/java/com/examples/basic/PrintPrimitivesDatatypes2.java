package com.examples.basic;

class PrintPrimitivesDatatypes2 {
	static int i;
	float f;
	boolean b;
	String s;

	public static void main(String[] arg) {
		/*
		 * int i; float f; char c; String s;
		 */
//in a method,variable has to be assigned to a value before it is used.

		PrintPrimitivesDatatypes2 ppd2 = new PrintPrimitivesDatatypes2();
		System.out.println("before initialising:");
		System.out.println("i= " + i + ", f = " + ppd2.f + ", b = " + ppd2.b + ", s = " + ppd2.s);
		i = 5;
		ppd2.f = 0.2f;
		ppd2.b = true;
		ppd2.s = "jvxvsdj";
		System.out.println("before  after initialising:");
		System.out.println("i= " + i + ", f = " + ppd2.f + ", b = " + ppd2.b + ", s = " + ppd2.s);

	}
}