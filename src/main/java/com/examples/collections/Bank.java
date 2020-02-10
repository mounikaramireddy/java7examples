package com.examples.collections;

import java.util.*;

class Bank {
	String bname;
	int bid;
	boolean isactive;

	public Bank() {
	}

	public Bank(String bname, int bid, boolean isActive) {
		this.bname = bname;
		this.bid = bid;
		this.isactive = isActive;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBname() {
		return bname;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getBid() {
		return bid;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public boolean getIsactive() {
		return isactive;
	}

	public String toString() {
		return "name= " + bname + " bid= " + bid + " isactive= " + isactive;
	}
}
