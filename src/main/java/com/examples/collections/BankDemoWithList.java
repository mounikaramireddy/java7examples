package com.examples.collections;

import java.util.*;

class BankDemoWithList {
	public static void main(String a[]) {
		List<Bank> l = new ArrayList<>();
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
		l.add(b);
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		System.out.println("usind tostring()");
		for (Bank bo : l) {
			System.out.println(bo);
		}
	}
}