package com.examples.collections;

import java.util.*;

class StudentMapEx {
	public static void main(String ag[]) {
		Map<Integer, Student> tm = new HashMap();
		Student s = new Student("tab", 121, 200, "aditya");
		Student s1 = new Student("Mouni", 122, 152, "Aditya");
		Student s2 = new Student("ram", 123, 153, "Aditya");
		Student s3 = new Student("nish", 124, 138, "Aditya");
		Student s4 = new Student("jyo", 125, 165, "Aditya");
		Student s5 = new Student("ruchi", 126, 123, "Aditya");
		Student s6 = new Student("anitha", 127, 190, "aditya");
		Student s7 = new Student("navya", 128, 180, "aditya");
		Student s8 = new Student("sus", 129, 200, "aditya");
		Student s9 = new Student("srujana", 130, 180, "aditya");
		tm.put(121, s);
		tm.put(122, s1);
		tm.put(123, s2);
		tm.put(124, s3);
		tm.put(125, s4);
		tm.put(126, s5);
		tm.put(127, s6);
		tm.put(128, s7);
		tm.put(129, s8);
		tm.put(130, s9);
		System.out.println("printing using entrySet:");
		Set<Map.Entry<Integer, Student>> m1 = tm.entrySet();
		for (Map.Entry<Integer, Student> m2 : m1) {
			if (m2.getKey() == 123) {
				System.out.println("123 found details= " + m2);
			}
		}
		System.out.println("printing using keySet:");

		Set<Integer> so = tm.keySet();
		for (Integer i : so) {
			if (i == 123) {
				System.out.println("123 found and details of 123= " + tm.get(i));
			}
		}
	}
}
