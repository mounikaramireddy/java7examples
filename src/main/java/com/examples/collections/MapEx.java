package com.examples.collections;

import java.util.*;

class MapEx {
	public static void main(String a[]) {
		Map<Integer, Bank> m = new HashMap<>();
		Bank b = new Bank();
		Bank b1 = new Bank();
		Bank b2 = new Bank("mouni", 123, true);
		Bank b3 = new Bank("tab", 124, true);
		Bank b4 = new Bank("anu", 125, true);
		Bank b5 = new Bank("navya", 126, true);
		Bank b6 = new Bank("sus", 127, false);
		Bank b7 = new Bank("anitah", 128, true);
		Bank b8 = new Bank("ramu", 129, false);
		Bank b9 = new Bank("srujana", 130, true);
		b.setBname("kittu");
		b.setBid(121);
		b.setIsactive(true);
		b1.setBname("lavanya");
		b1.setBid(122);
		b1.setIsactive(false);
		m.put(121, b);
		m.put(122, b1);
		m.put(123, b2);
		m.put(124, b3);
		m.put(125, b4);
		m.put(126, b5);
		m.put(127, b6);
		m.put(128, b7);
		m.put(129, b8);
		m.put(130, b9);
		System.out.println("using getters()");
		Bank bo = m.get(123);
		System.out.println("123 found:");
		System.out.println("name= " + bo.getBname() + " id= " + bo.getBid() + " isactive= " + bo.getIsactive());
	}
}