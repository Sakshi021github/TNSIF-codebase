package com.tns.D11.Multithreading;

public class DepositLimitException extends Exception {
	public DepositLimitException()
	{
		super("Daily limit of deposit ");
	}
	public DepositLimitException(String str) {
		super(str);
	}
	

}
