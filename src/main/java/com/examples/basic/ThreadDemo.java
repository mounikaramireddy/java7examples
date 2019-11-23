package com.examples.basic;

class ThreadDemo {
	public static void main(String a[]) {
		Thread t1 = Thread.currentThread();
		System.out.println("default thread names=" + t1);
		t1.setName("javath");
		System.out.println("thread names after modification:" + t1);
		System.out.println("execution status:" + t1.isAlive());
		Thread t2 = new Thread();
		System.out.println("default name of t2=" + t2.getName());
		System.out.println("execution status:" + t2.isAlive());
		System.out.println("value od max priority=" + t2.MAX_PRIORITY);
		System.out.println("value od min priority=" + t2.MIN_PRIORITY);
		System.out.println("value od normal priority=" + t2.NORM_PRIORITY);
	}
}