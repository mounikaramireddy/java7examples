package com.examples.exception;

public class Factorial {
	public long getFact(int n) throws IncorrectInputException {
		// public long getFact(int n) throws InvalidInputException{

		int fact = 1;
		if (n <= 0) {
			throw new IncorrectInputException("incorrect input " + n);
//throw new InvalidInputException("incorrect input " +n);
//System.out.println("here");

		} else {
			while (n > 0) {
				fact = fact * n;
				n--;
			}
		}
		return fact;
	}
}
