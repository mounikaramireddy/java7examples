package com.examples.collections;

class Student {
	private String sname;
	private String college;
	private int sno;
	private int marks;

	public Student() {
	}

	public Student(String sname, int sno, int marks, String college) {
		this.sname = sname;
		this.sno = sno;
		this.marks = marks;
		this.college = college;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getSno() {
		return sno;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCollege() {
		return college;
	}

	public String toString() {
		return "Sname= " + sname + "  Sno= " + sno + "  marks= " + marks + " College= " + college;
	}
}