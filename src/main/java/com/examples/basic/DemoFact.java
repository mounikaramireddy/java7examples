package com.examples.basic;

class DemoFact {
	public static void main(String k[]) {
		int x = Integer.parseInt(k[0]);
		if (k.length != 0) {
			Fact fo = new Fact();
			fo.set(x);
			fo.display();
		} else {
			System.out.println("it is an invalid input");
		}
	}
}