package com.tns.MultipleInheritance;

public class Country {
	
	
	//getter setter
	private String countryname;
	private String capital;
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Country [countryname=" + countryname + ", capital=" + capital + "]";
	}
	
	
	
	
	
	

}
