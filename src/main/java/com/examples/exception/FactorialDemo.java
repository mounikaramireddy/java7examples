package com.examples.exception;

class FactorialDemo {

	public static void main(String ar[]) {
		try {
			Factorial f = new Factorial();
			int i = Integer.parseInt(ar[0]);
			long l = f.getFact(i);
			System.out.println(l);
		} catch (IncorrectInputException e) {
			e.printStackTrace();

			// System.out.println(e.getMessage());
		} catch (Exception e) {
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}