package com.examples.exception;

import java.io.*;

class DataStreams {
	public static void main(String arg[]) {
		try {
			DataInputStream ds = new DataInputStream(System.in);
			System.out.println("enter two numbers");
			String s = ds.readLine();
			String s1 = ds.readLine();
			int x = Integer.parseInt(s);
			int y = Integer.parseInt(s1);
			int z = x + y;
			System.out.println(z);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}