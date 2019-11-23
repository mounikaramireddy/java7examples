package com.examples.basic;

class This {
	int a = 10, b = 20;

	void m1(int a, int b) {
		/*
		 * abcd a1=new abcd(); we donot need to creat object to access class level
		 * variables.we can access using "this" keyword.
		 */
		System.out.println("a= " + a + " b=" + b);
		// System.out.println("class a= " +a1.a+ "class b=" +a1.b);
		System.out.println("class a= " + this.a + "  class b=" + this.b);
	}

public static void main(String []arg){
	This a1=new This();
	a1.m1(3,4);
}
}
