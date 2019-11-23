package com.examples.exception;

public class Palindrome {
	public int getPalindrome(int n) {
		int pal = 0;
		if (n < 10) {
			throw new InvalidInputException("Invalid input:" + n);
		} else {
			while (n > 0) {
				pal = pal * 10 + (n % 10);
				n = n / 10;
			}
		}
		return pal;
	}
}
