package com.examples.basic;

class Sum1 {
	int a, b, c;

	void assign(int n1, int n2) {
		a = n1;
		b = n2;
	}

	void add() {
		c = a + b;
	}

	void display() {
		System.out.println("value of a=" + a);
		System.out.println("value of b=" + b);
		System.out.println("sum =" + c);
	}
}

class SumDemo1 {
	public static void main(String ar[]) {
		if (ar.length != 2) {
			System.out.println("enter two values");
		} else {
			int n1 = Integer.valueOf(ar[0]);
			int n2 = Integer.parseInt(ar[1]);
			Sum1 s0 = new Sum1();
			s0.assign(n1, n2);
			s0.add();
			s0.display();
		}
	}
}