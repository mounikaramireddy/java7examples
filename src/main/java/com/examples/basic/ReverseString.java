package com.examples.basic;

class ReverseString// string reverse using string methods
{
	public static void main(String args[]) {
		String original = "father";
		// Scanner in = new Scanner(System.in);

		// System.out.println("Enter a string to reverse");
		// original = in.nextLine();

		String reverse = "";
		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
			// charAt() is a String method which accepts int argument. index

		}

		System.out.println("Reverse of the string: " + reverse);
	}
}