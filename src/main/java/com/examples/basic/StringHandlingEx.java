package com.examples.basic;

class StringHandlingEx {
	public static void main(String[] ar) {
		String a = "first";
		System.out.println(a);
		System.out.println(a + "second");
//System.out.println(a+ "bc");
		System.out.println("after appending second to variable a, a=  " + a);

		StringBuilder s = new StringBuilder("first");
		System.out.println("initially s= " + s);

		System.out.println(s.append("second"));
		System.out.println("after appending second with append method to s, s=  " + s);

		s.append("third");

		System.out.println(s);
	}
}