package com.tns.D11.Multithreading;

public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException()
	{
		super("Insufficient balance in your ");
	}
	public InsufficientBalanceException(String msg) {
		super(msg);
	}

}
