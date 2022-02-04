package com.nt.entity;

public class Student {
	private String name;
	private String sname;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sname=" + sname + "]";
	}
	

}
