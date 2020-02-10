package com.examples.collections;

import java.util.*;

class EmployeeMap {
	private String ename;
	private String eorg;
	private int esal;
	private int eid;

	public EmployeeMap() {
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		return eid;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	public int getEsal() {
		return esal;
	}

	public void setEorg(String eorg) {
		this.eorg = eorg;
	}

	public String getEorg() {
		return eorg;
	}
}