package com.examples.basic;

class ArmstrongNumber {
	public static void main(String[] arg) {
		int n = 153, result = 0;
		int temp = n;
		while (n != 0) { // 153 15 1 0
			int rem = n % 10; // 3 5 0
			result = result + rem * rem * rem; // 3 3 + 5 1+3+5
			n = n / 10; // 15 1 0
		}
		System.out.println(result);

		if (temp == result)
			System.out.println("given number is armstong");
		else {
			System.out.println("not armstong");
		}
	}
}