package com.examples.collections;

import java.util.*;

class MapEx2 {
	public static void main(String a[]) {
		Map<Integer, Integer> m = new HashMap<>();
		m.put(1, 23);
		m.put(2, 34);
		m.put(3, 54);
		m.put(4, 65);
		m.put(5, 34);
		Set<Map.Entry<Integer, Integer>> s = m.entrySet();
		for (Map.Entry<Integer, Integer> i : s) {
			if (i.getValue() == 34) {
				System.out.println(i.getKey());
				break;
			}
		}
	}
}