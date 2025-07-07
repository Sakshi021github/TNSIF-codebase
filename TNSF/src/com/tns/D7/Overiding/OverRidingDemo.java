package com.tns.D7.Overiding;

public class OverRidingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi;
		
		//Dynamic binding assigning child object to parent class reference variables 
		rbi=new SBI();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new ICICI();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateofInterest());

		
	}

}
