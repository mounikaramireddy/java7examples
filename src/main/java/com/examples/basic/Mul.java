package com.examples.basic;

class Mul {
	int n;

	void set(int x) {
		n = x;
	}

	void table() {
		System.out.println("table of  " + n + " is");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}
}

class muldemo {
	public static void main(String i[]) {
		int x = Integer.parseInt(i[0]);
		Mul mo = new Mul();
		mo.set(x);
		mo.table();
	}
}