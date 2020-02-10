package com.examples.collections;

import java.util.*;

class ListIntEx {
	public static void main(String ag[]) {
		List<Integer> l = new ArrayList<>();
		if (l.isEmpty()) {
			System.out.println("list is empty");
		}
		for (int i = 0; i < 10; i++) {
			l.add(i);
		}
		l.add(null);
		l.add(null);/*
					 * for(int i:l){ System.out.println(i); }
					 */
		System.out.println(" list= " + l);

		System.out.println("list size= " + l.size());
		if (!l.contains(11)) {
			System.out.println("11 element not found");
		}
		System.out.println("5th element= " + l.get(4));
		System.out.println("removing 4th element= " + l.remove(3));
		System.out.println("after removing list= " + l);

		System.out.println("5th index element= " + l.get(4));
		// System.out.println("removing element 5= "+l.remove(new Integer(5)));

		System.out.println("removing element 5= " + l.remove(Integer.valueOf(5)));
		System.out.println("after removing list= " + l);
		l.clear();
		System.out.println("after clearing list= " + l);

		System.out.println("end of main");

	}
}
