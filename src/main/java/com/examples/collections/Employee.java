package com.examples.collections;

import java.util.*;

class Employee {
	private int Enum;
	private String ename;
	private float esal;
	private String ecompany;

	public Employee() {
	}

	public Employee(String ename, int Enum, float esal, String ecompany) {
		this.ename = ename;
		this.Enum = Enum;
		this.esal = esal;
		this.ecompany = ecompany;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public void setEnum(int Enum) {
		this.Enum = Enum;
	}

	public int getEnum() {
		return Enum;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

	public float getEsal() {
		return esal;
	}

	public void setEcompany(String ecompany) {
		this.ecompany = ecompany;
	}

	public String getEcompany() {

		return ecompany;
	}

	public String toString() {
		return "ename= " + ename + " Enum= " + Enum + " esal= " + esal + " ecompany= " + ecompany;
	}
}