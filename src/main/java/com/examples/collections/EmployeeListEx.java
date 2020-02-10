package com.examples.collections;

import java.util.*;

class EmployeeListEx {
	public static void main(String ag[]) {
		List<Employee> l = new ArrayList<>();
		Employee e = new Employee("ganesh", 1234, 40000.0f, "Abc");
		Employee e1 = new Employee("ramesh", 1235, 30000.0f, "Abc");
		Employee e2 = new Employee("suresh", 1236, 29000.0f, "Abc");
		Employee e4 = new Employee("naresh", 1238, 39000.0f, "Abc");
		Employee e3 = new Employee();
		e3.setEname("mahesh");
		e3.setEnum(1237);
		e3.setEsal(25000.0f);
		e3.setEcompany("Abc");
		l.add(e);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		System.out.println("using toString() method");
		for (Employee s : l) {
			System.out.println(s);
		}
		System.out.println("using getters() method");
		for (Employee s : l) {
			// System.out.println(s);
			System.out.println("Ename= " + s.getEname() + "  Enum= " + s.getEnum() + "  Esal= " + s.getEsal()
					+ "  Ecompany= " + s.getEcompany());
		}
		System.out.println("obtaing details using == method");
		for (Employee s : l) {
			if (s.getEnum() == 1237) {
				System.out.println("1237 found: details of 1237:" + s);
			}
		}
	}
}