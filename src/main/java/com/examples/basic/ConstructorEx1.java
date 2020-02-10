package com.examples.basic;

class ConstructorEx1{
	int a, b;

	ConstructorEx1() {
		this(1000);
		System.out.println("Test dc");
		a = 1;
		b = 2;
		System.out.println("value of a=" + a);
		System.out.println("value of b=" + b);
	}

	ConstructorEx1(int x) {
		System.out.println("test spc");
		a = x;
		b = x;
		System.out.println("value of a=" + a);
		System.out.println("value of b=" + b);
	}

	ConstructorEx1(int x, int y) {
		this();
		System.out.println("test dpc");
		a = x;
		b = y;
		System.out.println("value of a=" + a);
		System.out.println("value of b=" + b);
	}
}

class ThisConstructor {
	public static void main(String[] ars) {
		Test t1 = new Test();
	}
}