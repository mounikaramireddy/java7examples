package com.examples.basic;

class Fact {
	int n;

	void set(int x) {
		n = x;
	}

	int factcal() {
		int f = 1;
		while (n > 0) {
			f = f * n;
			n = n - 1;
		}
		return f;
	}

	void display() {
		int res = factcal();
		System.out.println("factorial =" + res);
	}
}
