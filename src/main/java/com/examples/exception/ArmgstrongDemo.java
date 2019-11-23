package com.examples.exception;

class ArmgstrongDemo {
	public static void main(String ag[]) {
		// System.exit(1); it will exit the code
		try {
			Armgstrong a1 = new Armgstrong();
			int i = a1.checkArmstrong(0);
			System.out.println(i);
			if (i == 0) {
				System.out.println("armgstrong number:" + i);
			} else {
				System.out.println("not armgstrong number:" + i);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}