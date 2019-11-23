package com.examples.basic;

class SingletonDemo {
	public static void main(String ar[]) {
		Singleton d1 = Singleton.factoryMethod();
		Singleton d2 = Singleton.factoryMethod();
		if (d1 == d2) {
			System.out.println("both are same");
		} else
			System.out.println("not same");
	}
}