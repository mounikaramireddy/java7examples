package com.examples.basic;

public class Singleton {
	static Singleton s;

	private Singleton() {
	}

	public static Singleton factoryMethod() {
		if (s == null) {
			System.out.println("object creation");

			s = new Singleton();
		}
		return s;
	}

}