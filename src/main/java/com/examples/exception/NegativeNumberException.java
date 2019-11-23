package com.examples.exception;

class NegativeNumberException extends Exception {
}

class ExceptioDemo3 {
	void cube(int a) throws NegativeNumberException {
		if (a > 0)
			System.out.println(a * a * a);
		else
			throw new NegativeNumberException();
	}

	public static void main(String ar[]) {
		try {
			int x = Integer.parseInt(ar[0]);
			ExceptioDemo3 ed = new ExceptioDemo3();
			ed.cube(x);
		} catch (NegativeNumberException ne) {
			System.out.println(ne);
		}
	}
}
