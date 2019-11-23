package com.examples.basic;

class PrintPrimitivesDatatypesUsingMethod {
	static int i;
	float f;
	boolean b;
	String s;

	public static void main(String[] arg) {

		System.out.println(" main () started:");

		PrintPrimitivesDatatypesUsingMethod obj1 = new PrintPrimitivesDatatypesUsingMethod();
		System.out.println("before initialising:");
		System.out.println("i= " + i + ", f = " + obj1.f + ", b = " + obj1.b + ", s = " + obj1.s);
		obj1.initialiseData();
		System.out.println(" main () ending:");
	}

	void initialiseData() {
		System.out.println(" initialiseData () started:");

		i = 2;
		f = 0.23f;
		b = true;
		s = "jhcgdhs";
		System.out.println("after initialising:");
		System.out.println("i= " + i + ", f = " + f + ", b = " + b + ", s = " + s);
		System.out.println(" initialiseData() ending:");

	}

	// System.out.println(" started:");

}