package com.examples.jdbc;

class StudentDemo {
	private String name;
	private int id;
	private String branch;
	private String email;
	private String clg;
	private int marks;
	private int addressid;

	public void setName(String sname) {
		name = sname;
	}

	public String getName() {
		return name;
	}

	public void setId(int sid) {
		id = sid;
	}

	public int getId() {
		return id;
	}

	public void setBranch(String sbranch) {
		branch = sbranch;
	}

	public String getBranch() {
		return branch;
	}

	public void setClg(String sclg) {
		clg = sclg;
	}

	public String getClg() {
		return clg;
	}

	public void setEmail(String semail) {
		email = semail;
	}

	public String getEmail() {
		return email;
	}

	public void setMarks(int smarks) {
		marks = smarks;
	}

	public int getMarks() {
		return marks;
	}

	public void setAddressid(int saddre) {
		addressid = saddre;
	}

	public int getAddressid() {
		return addressid;
	}

}