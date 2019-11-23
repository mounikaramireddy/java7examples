package com.examples.exception;

class primenumberDemo {
	public static void main(String ag[]) {
		Primenumber p = new Primenumber();
		boolean i = p.chechkprime(12);
		if (i) {
			System.out.println("enter number is prime:" + i);
		} else {
			System.out.println("enter number is not prime:" + i);

		}
	}
}