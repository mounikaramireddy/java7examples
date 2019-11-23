package com.examples.basic;

class PallindromeUsingMethods {
	public static void main(String[] arg) {
		PallindromeUsingMethods p1 = new PallindromeUsingMethods();
		int input = 121;
		int reverse = p1.reve(input);
		System.out.println("Given number = " + reverse);
		if (input == reverse) {
			System.out.println("pallindrome");

		} else {
			System.out.println("not pallindrome");

		}

	}

	int reve(int n) {
		int i = 0;
		int rev = 0;
		while (n != 0) {
			i = n % 10;
			rev = i + 10 * rev;
			n = n / 10;
		}
		return rev;
	}
}