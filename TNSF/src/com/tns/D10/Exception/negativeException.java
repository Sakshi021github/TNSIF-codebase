package com.tns.D10.Exception;

public class negativeException extends Exception {
	
	public negativeException(String string)
	{
		super (string);
		
	}
	public negativeException()
	{
		super("Percenatge should not be negative");
		
	}

}
