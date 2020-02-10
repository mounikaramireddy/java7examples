package com.examples.collections;

import java.util.*;

class Employee2MapEx {
	public Map<Integer, Employee2> createEmployeeMap() {
		Map<Integer, Employee2> m = new HashMap<>();
		Employee2 e = new Employee2();
		e.setEname("Mounika");
		e.setEid(121);
		e.setEsal(25000);
		e.setEorg("Abc");
		Employee2 e1 = new Employee2();
		e1.setEname("tab");
		e1.setEid(122);
		e1.setEsal(26000);
		e1.setEorg("Abc");
		Employee2 e2 = new Employee2();
		e2.setEname("anitha");
		e2.setEid(123);
		e2.setEsal(27000);
		e2.setEorg("Abc");
		Employee2 e3 = new Employee2();
		e3.setEname("navya");
		e3.setEid(124);
		e3.setEsal(26000);
		e3.setEorg("Abc");
		Employee2 e4 = new Employee2();
		e4.setEname("srujana");
		e4.setEid(125);
		e4.setEsal(25000);
		e4.setEorg("Abc");
		Employee2 e5 = new Employee2();
		e5.setEname("ramu");
		e5.setEid(126);
		e5.setEsal(24000);
		e5.setEorg("Abc");
		Employee2 e6 = new Employee2();
		e6.setEname("sush");
		e6.setEid(127);
		e6.setEsal(30000);
		e6.setEorg("Abc");
		Employee2 e7 = new Employee2();
		e7.setEname("kittu");
		e7.setEid(128);
		e7.setEsal(21000);
		e7.setEorg("Abc");
		Employee2 e8 = new Employee2();
		e8.setEname("lavnaya");
		e8.setEid(129);
		e8.setEsal(24000);
		e8.setEorg("Abc");
		Employee2 e9 = new Employee2();
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
		return m;
	}

	public void checkEmploye(Map<Integer, Employee2> m, int id) {
		Set<Integer> s = m.keySet();
		for (Integer i : s) {
			if (i == id) {
				System.out.println("employee found ");
				Employee2 eob = m.get(i);
				System.out.println("name= " + eob.getEname() + " value= " + eob.getEsal());
			} else {
				System.out.println("not found");
			}
		}
	}

	public static void main(String ar[]) {
		Employee2MapEx ob = new Employee2MapEx();
		Map<Integer, Employee2> m = ob.createEmployeeMap();
		ob.checkEmploye(m, 122);
	}
}
