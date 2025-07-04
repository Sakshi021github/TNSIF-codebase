package com.tns.D6.Final;

public class FinalVariable {
	
	final int x=100;
	
	//declare a static black final variable
	final static int y;
	
	//Declare and initialize 
	final static int z=10;
	
	//instance method
	void change()
	{
		//x=30; final variable cannot change
		//z=50; //no reassign
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ",y=" + y + "]";
	}
	
	//declare a static block
	static
	{
		y=20;
		//z=80; once initialize cannot be change
	}
	
	
	

}
