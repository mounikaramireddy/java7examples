package com.examples.basic;

class  GcdTest {
	// Recursive function to return gcd of a and b
	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	// Driver method
	public static void main(String[] args) {
		int a = 9, b = 6;
		System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
	}
}
