package com.tns.hierarchical;

public class Person {
	
	private String name;
	private String city;
	
	public Person() {
		System.out.println("person class default class");
		name="Sakshi";
		city="Mumbai";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	

}
