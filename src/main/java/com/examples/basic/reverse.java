package com.examples.basic;

class reverse {
	int n = 189;
	int i;
	int rev = 0;

	public static void main(String[] arg) {
		reverse obj = new reverse();
		for (obj.i = 0; obj.n != 0; obj.i++) {
			obj.i = obj.n % 10;
			obj.rev = obj.rev * 10 + obj.i;
			obj.n = obj.n / 10;
		}
		System.out.println("rev =" + obj.rev);
	}
}
