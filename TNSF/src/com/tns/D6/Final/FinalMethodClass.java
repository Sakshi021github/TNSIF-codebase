package com.tns.D6.Final;

public class FinalMethodClass {
	
	//constructor
	
	public FinalMethodClass() {
		System.out.println("This is my default constructor"); 
	}
	
	final int a=50;
	//final method
	final void show()
	{
		System.out.println("value of a:"+a);
	}

}
