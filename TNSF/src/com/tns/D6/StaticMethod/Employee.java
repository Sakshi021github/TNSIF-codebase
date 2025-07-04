package com.tns.D6.StaticMethod;

public class Employee {
	private String name;
	private int id;
	
	//Declare a static compnay name with data type string of 
	
	static String companyname="TNSIF";
	
	//Declaring two parameter 
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "companyname"+companyname+ "]";
	}
	
	
	
	

}
