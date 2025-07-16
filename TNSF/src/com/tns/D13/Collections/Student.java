package com.tns.D13.Collections;

public class Student {
	
	//data members
	private int id;
	private String name;
	private double per;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
