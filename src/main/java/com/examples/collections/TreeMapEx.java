package com.examples.collections;

import java.util.*;

class TreeMapEx {
	public static void main(String a[]) {
		TreeMap<Integer, Integer> t = new TreeMap<>();
//System.out.println(t.isempty());
		System.out.println("size= " + t.size());
		t.put(1, 14);
		t.put(3, 34);
		t.put(2, 15);
		t.put(1, null);
		t.put(5, 334);
		t.put(4, 94);
		System.out.println(t);
		System.out.println("iterating using entryset");

		Set<Map.Entry<Integer, Integer>> s = t.entrySet();
		for (Map.Entry<Integer, Integer> m : s) {
			System.out.println("key= " + m.getKey() + " value= " + m.getValue());
		}

		System.out.println("iterating using keyset");
		Set<Integer> s1 = t.keySet();
		for (Integer i : s1) {
			System.out.println("key= " + i + " value= " + t.get(i));
		}

	}
}