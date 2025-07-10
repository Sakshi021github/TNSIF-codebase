package com.tns.D10.Exception;

public class greatervalueException extends Exception{
	
	public greatervalueException (String string)
	{
		super(string);
	}
		public greatervalueException()
		{
			super("Percenatge should be greater than 100");
			
		}


}
