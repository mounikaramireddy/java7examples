package com.examples.basic;

class a {
	a(int n) {
		int rev = 0;
		while (n > 0) {
			int i = n % 10;
			rev = i + 10 * rev;
			n = n / 10;
		}
		System.out.println(rev);
	}

}

class aa {
	public static void main(String k[]) {
		int x = Integer.parseInt(k[0]);
		if (k.length == 0)
			System.out.println("invalid");
		else {
			a obj = new a(x);
		}

	}
}