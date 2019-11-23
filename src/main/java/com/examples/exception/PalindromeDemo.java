package com.examples.exception;

class PalindromeDemo {
	public static void main(String arg[]) {
		Palindrome p = new Palindrome();
		int i = Integer.parseInt(arg[0]);
		int l = p.getPalindrome(i);
		if (l == i) {
			System.out.println("given number is palindrome:" + l);
		} else {
			System.out.println("given number is not palindrome:" + l);

		}
	}
}