package com.examples.basic;

class DataPrint {
	public static void main(String a[]) {
		System.out.println("no.of command line arguments:" + a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]= " + a[i]);
		}
	}
}