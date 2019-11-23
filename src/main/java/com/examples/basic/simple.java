package com.examples.basic;

class simple {
	int a, b;

	simple(int a, int b) {
		this.a = a; // assigning formal parameters to datamembers of class
		this.b = b;// assigning formal parameters to datamembers of class
		a = a + 1;
		b = b + 1;// modifying formal parameters
		this.a = this.a + 2;
		this.b = this.b + 2;// modifying datamembers of classs
		System.out.println("value of a=" + a);// 2
		System.out.println("value of b=" + b);// 3
	}

	void display() {
		System.out.println("value of a=" + this.a);// 3
		System.out.println("value of b=" + this.b);// 4

	}

	public static void main(String[] args) {
		simple d1 = new simple(1, 2);
		d1.display();
		System.out.println("end of main");

	}
}