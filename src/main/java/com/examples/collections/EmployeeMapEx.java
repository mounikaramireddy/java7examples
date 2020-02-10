package com.examples.collections;

import java.util.*;

class EmployeeMapEx {
	public static void main(String ar[]) {
		Map<Integer, EmployeeMap> m = new HashMap<>();
		EmployeeMap e = new EmployeeMap();
		e.setEname("Mounika");
		e.setEid(121);
		e.setEsal(25000);
		e.setEorg("Abc");
		EmployeeMap e1 = new EmployeeMap();
		e1.setEname("tab");
		e1.setEid(122);
		e1.setEsal(26000);
		e1.setEorg("Abc");
		EmployeeMap e2 = new EmployeeMap();
		e2.setEname("anitha");
		e2.setEid(123);
		e2.setEsal(27000);
		e2.setEorg("Abc");
		EmployeeMap e3 = new EmployeeMap();
		e3.setEname("navya");
		e3.setEid(124);
		e3.setEsal(26000);
		e3.setEorg("Abc");
		EmployeeMap e4 = new EmployeeMap();
		e4.setEname("srujana");
		e4.setEid(125);
		e4.setEsal(25000);
		e4.setEorg("Abc");
		EmployeeMap e5 = new EmployeeMap();
		e5.setEname("ramu");
		e5.setEid(126);
		e5.setEsal(24000);
		e5.setEorg("Abc");
		EmployeeMap e6 = new EmployeeMap();
		e6.setEname("sush");
		e6.setEid(127);
		e6.setEsal(30000);
		e6.setEorg("Abc");
		EmployeeMap e7 = new EmployeeMap();
		e7.setEname("kittu");
		e7.setEid(128);
		e7.setEsal(21000);
		e7.setEorg("Abc");
		EmployeeMap e8 = new EmployeeMap();
		e8.setEname("lavnaya");
		e8.setEid(129);
		e8.setEsal(24000);
		e8.setEorg("Abc");
		EmployeeMap e9 = new EmployeeMap();
		e9.setEname("Mouni");
		e9.setEid(130);
		e9.setEsal(21000);
		e9.setEorg("Abc");
		m.put(121, e);
		m.put(122, e1);
		m.put(123, e2);
		m.put(124, e3);
		m.put(125, e4);
		m.put(126, e5);
		m.put(127, e6);
		m.put(128, e7);
		m.put(129, e8);
		m.put(130, e9);
		Set<Integer> s = m.keySet();
		for (Integer i : s) {
			//System.out.println("key= " + i + " value= " + m.get(i));
			if (i == 122) {
				System.out.println("122 found and details are:" + i);
			}
		}
	}
}
