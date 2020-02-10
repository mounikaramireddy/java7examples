package com.examples.collections;

import java.util.*;

class Student2ListEx {
	public List<Student2> createStudents() {
		List<Student2> l = new ArrayList<>();
		Student2 s = new Student2();
		s.setSname("mounika");
		s.setSmarks(868);
		s.setSid(121);
		s.setScollege("aditya");
		Student2 s1 = new Student2();
		s1.setSname("kiran");
		s1.setSmarks(908);
		s1.setSid(122);
		s1.setScollege("aditya");
		Student2 s2 = new Student2();
		s2.setSname("navya");
		s2.setSmarks(890);
		s2.setSid(123);
		s2.setScollege("aditya");
		Student2 s3 = new Student2();
		s3.setSname("anitha");
		s3.setSmarks(968);
		s3.setSid(124);
		s3.setScollege("aditya");
		Student2 s4 = new Student2();
		s4.setSname("anusha");
		s4.setSmarks(860);
		s4.setSid(125);
		s4.setScollege("aditya");
		Student2 s5 = new Student2();
		s5.setSname("ramu");
		s5.setSmarks(840);
		s5.setSid(126);
		s5.setScollege("aditya");
		Student2 s6 = new Student2();
		s6.setSname("sush");
		s6.setSmarks(970);
		s6.setSid(127);
		s6.setScollege("aditya");
		Student2 s7 = new Student2();
		s7.setSname("kittu");
		s7.setSmarks(800);
		s7.setSid(128);
		s7.setScollege("aditya");
		Student2 s8 = new Student2();
		s8.setSname("lavanya");
		s8.setSmarks(868);
		s8.setSid(129);
		s8.setScollege("aditya");
		Student2 s9 = new Student2();
		s9.setSname("srujana");
		s9.setSmarks(898);
		s9.setSid(130);
		s9.setScollege("aditya");
		l.add(s);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
		l.add(s8);
		l.add(s9);
		return l;
	}

	public void checkStudent(List<Student2> l, int sno) {
		System.out.println("printing with getters");

		for (Student2 sob : l) {
			// System.out.println("name= "+sob.getSname()+" id= "+sob.getSid()+" marks=
			// "+sob.getSmarks()+" college= "+sob.getScollege());
			if (sob.getSid() == sno) {
				System.out.println("name= " + sob.getSname() + " college= " + sob.getScollege());
			}
		}
	}

	public static void main(String ag[]) {
		Student2ListEx obj = new Student2ListEx();
		List<Student2> l = obj.createStudents();
		obj.checkStudent(l, 123);
	}
}
