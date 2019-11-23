package com.examples.basic;

class sum {
	int a, b, c;

	void assign() {
		a = 2;
		b = 3;
	}

	void add() {
		c = a + b;
	}

	void display() {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("adddition=" + c);
	}
}

class SumDemo {
	public static void main(String[] arg) {
		System.out.println("i am at starting of main()");
		sum s1 = new sum();
		s1.assign();
		s1.add();
		s1.display();
		System.out.println("i am at ending of main()");
	}
}
