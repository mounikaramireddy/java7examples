package com.examples.collections;

import java.util.*;

class MapEx3 {
	public static void main(String a[]) {
		Map<Integer, Integer> m = new HashMap<>();
		m.put(1, 23);
		m.put(2, 34);
		m.put(3, 54);
		m.put(4, 65);
		m.put(5, 34);
		Set<Map.Entry<Integer, Integer>> s = m.entrySet();
		List<Integer> l = new ArrayList<>();
		for (Map.Entry<Integer, Integer> i : s) {
			if (i.getValue() == 34) {
				l.add(i.getKey());
				System.out.println("the keys:" + l);
			}
		}
	}
}
