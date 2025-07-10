package com.tns.D10.Exception;

import javax.sound.midi.SysexMessage;

public class TryCatchExample {
	public static void performDivision(int x, int y)
	{
		System.out.println("I am an method");
		int z;
		try {
			System.out.println("i am in a block");
			z=x/y;
			System.out.println("Result of z:" +z);
		}
		catch (ArithmeticException e)
		{
			
			System.err.println("I am in catch block :"+e.getMessage());
			
		}
	}
	

}
