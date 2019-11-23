package com.examples.basic;

class ThreadDemo3 {
	public static void main(String a[]) {
		ThreadDemo2 t1 = new ThreadDemo2();
		System.out.println("status of t1 before start=" + t1.isAlive());
		t1.start();
		System.out.println("status of t1 before start=" + t1.isAlive());
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("status of t1 after completion=" + t1.isAlive());
	}
}