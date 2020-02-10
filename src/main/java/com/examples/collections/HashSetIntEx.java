package com.examples.collections;

import java.util.*;

class HashSetIntEx {
	public static void main(String a[]) {
		HashSet<Integer> hs = new HashSet<>();
		// TreeSet<Integer> ts = new TreeSet<>();
		System.out.println("size= " + hs.size());
		hs.add(12);
		hs.add(null);
		hs.add(null);
		hs.add(null);
		hs.add(null);
		hs.add(10);
		hs.add(13);
		hs.add(58);
		System.out.println(hs);
		System.out.println("size= " + hs.size());
		if (hs.contains(12)) {
			System.out.println("found");

		}
		System.out.println("removing element= " + hs.remove(10));
		System.out.println(hs);
		hs.clear();
		System.out.println("aftyer clearing list");
		System.out.println(hs);

	}
}