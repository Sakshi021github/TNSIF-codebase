package com.tns.D8.Interface;

public interface Bank {
	
	final static float MINBAL=5000;
	final static float Deposit_Limit=25000;
	
	public void deposit(float ammount);
	public void withdraw(float ammount);
	
	
	

}
