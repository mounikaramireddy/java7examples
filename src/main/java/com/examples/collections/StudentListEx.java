package com.examples.collections;

import java.util.*;

class StudentListEx {
	public static void main(String a[]) {
		List<Student> l = new ArrayList<>();
		Student s = new Student("Mouni", 11, 152, "Aditya");
		Student s1 = new Student("ram", 12, 153, "Aditya");
		Student s2 = new Student("nish", 13, 138, "Aditya");
		Student s3 = new Student("jyo", 14, 165, "Aditya");
//Student s4=new Student("ruchi",15,123,"Aditya");
		System.out.println("assinging values for private variables through setters");
		Student s4 = new Student();
		s4.setSname("ruchi");
		s4.setSno(15);
		s4.setMarks(165);
		s4.setCollege("Aditya");

		l.add(s);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		System.out.println("printing list using toString()");
		for (Student ss : l) {
			System.out.println(ss);
		}
		System.out.println("printing list using getters");

		for (Student si : l) {
			System.out.println("name= " + si.getSname() + "  number= " + si.getSno() + "  marks= " + si.getMarks()
					+ "  college= " + si.getCollege());
		}
		for (Student si : l) {

			if (si.getSname().equals("nish")) {
				System.out.println("nish found : nish details = " + si);
			}

		}
	}
}