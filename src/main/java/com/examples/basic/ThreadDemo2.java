package com.examples.basic;

class ThreadDemo2 extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("value of i=" + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}