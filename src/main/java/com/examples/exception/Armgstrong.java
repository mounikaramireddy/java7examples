package com.examples.exception;

public class Armgstrong {
	public int checkArmstrong(int n) throws IncorrectInputException {
		int arm = 0;
		int rem;
		if (n <= 0) {
			throw new IncorrectInputException("invalid input:" + n);
		} else {
			while (n > 0) {
				rem = n % 10;
				arm += rem * rem * rem;
				n = n / 10;
			}
		}
		return arm;
	}
}