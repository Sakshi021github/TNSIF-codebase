package com.tns.D8.Interface;

//Entity
public class Customer {
	private String city;
	private String name;
	
	//getter setter
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// default construtor 
	public Customer(String city, String name) {
		super();
		this.city = city;
		this.name = name;
	}
	
	

}
