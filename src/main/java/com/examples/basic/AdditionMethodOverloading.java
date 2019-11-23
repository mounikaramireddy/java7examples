package com.examples.basic;

class AdditionMethodOverloading {

	public static void main(String[] ar) {
		AdditionMethodOverloading obj1 = new AdditionMethodOverloading();
		obj1.add(1, 2);
		obj1.add(1, 2, 3);
		obj1.add(2, 0.3f);
		obj1.add(0.23f, 30);
		obj1.add(10, 10.9f, "s1");
		obj1.add(100, "s2", 10.0f);
	}

//number of arguments are different 
	void add(int i, int j) {
		int result = i + j;
		System.out.println("addition of two integer =" + result);
	}

	/*
	 * below method is not allowed,it will give compilation error. it will treat the
	 * method as duplicate method overloading does not consider return type of
	 * method
	 */
	/*
	 * int add(int i,int j){ int result=i+j;
	 * System.out.println("addition of two integer =" +result); return result; }
	 */
	int add(int k, int j, int i) {
		int result = k + j + i;
		System.out.println("addition of three integer =" + result);
		return result;
	}

//number of arguments are same but type of arguments arae different.

	void add(int i, float j) {
		float result = i + j;
		System.out.println("addition of  int and  float =" + result);
	}

	float add(float j, int i) {
		float result = j + i;
		System.out.println("addition of float and int =" + result);
		return result;
	}

	/*
	 * number of arguments (total=3) and type of arguments(1 int,1 float,1 string
	 * type) are same but the order is different
	 */
	void add(int i, float f, String s) {
		String result = i + f + s;
		System.out.println("addition of int,float,String is=" + result);
	}

	void add(int i, String s, float f) {
		String result = i + s + f;
		System.out.println("addition of int,String,float is=" + result);

	}

}