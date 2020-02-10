package com.examples.collections;

import java.util.*;

class SetEx {
	public static void main(String a[]) {
		Set<Integer> s = new HashSet<>();
		if (s.isEmpty()) {
			System.out.println("set is empty");
		}
		s.add(10);
		s.add(12);
		s.add(134);
		s.add(43);
		s.add(32);
		System.out.println("set= " + s);
		System.out.println("set size= " + s.size());
		System.out.println("removing element 12= " + s.remove(12));
		System.out.println("after removing 12 from set= " + s);
		if (s.contains(32)) {
			System.out.println("32 is found");
		}
		System.out.println(s.remove(4));
		s.clear();
		System.out.println("after clearing set= " + s);

	}
}