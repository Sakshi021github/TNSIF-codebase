package com.tns.D6.StaticMethod;

public class StaticMethod {
	private int section;
	private static int srNo;
	
	//static block
	static
	{
		System.out.println("------Within static block------");
		srNo=1000;
		//section=101;
		
		
		
	
	}
	
	//default constructor
	public StaticMethod()
	{
		System.out.println("-----This is my default constructor");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "StaticMethod [serial No "+srNo+",section=" + section + "]";
	}
	
	//static method
	
	static void display()
	{
		
		System.out.println("serial No:"+srNo);
	}
	
	
	

}

