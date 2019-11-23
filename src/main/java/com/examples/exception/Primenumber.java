package com.examples.exception;

public class Primenumber {
	public boolean chechkprime(int n) {
		int i;
		boolean flag = true;
		if (n <= 1) {
			throw new InvalidInputException("invalid input. please pass input > 1");
		} else {
			for (i = 2; i <= (n / 2); i++) {
				// condition for nonprime number
				if ((n % i) == 0) {
					flag = false;
					System.out.println("inside if");
					break;
				}
			}
		}
		return flag;
	}
}
