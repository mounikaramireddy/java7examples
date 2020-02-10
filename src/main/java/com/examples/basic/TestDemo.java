package com.examples.basic;

class Test{
	static {
		System.out.println("Test static block 2");
	}
	static int a, b;

	// private Test(){
	/*
	 * private is not allowed .coz we r trying to call constructor in another
	 * class(TestDemo)
	 */
	Test() {
		System.out.println("test default");
		a = 100;
		b = 200;
		return; // return statement is allowed, no compilation error .But returning(return a) a
				// value is not allowed

	}

// private void print(){
	/*
	 * private is not allowed .coz private methods are not accesseble outside of
	 * class
	 */
	void print() {
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}

	static {
		System.out.println("Test static block 1");
	}
	{
		System.out.println("Test non static block 1");

	}

}

class TestDemo {
	static {
		System.out.println("TestDemo static block 2");
	}

	public static void main(String[] ar) {
		System.out.println("start of main method");
		Test t = new Test();
		t.print();
		System.out.println("end of main method");

	}

	static {
		System.out.println("TestDemo static block 1");
	}
	{
		System.out.println("TestDemo nonstatic block 1");
	}

}
