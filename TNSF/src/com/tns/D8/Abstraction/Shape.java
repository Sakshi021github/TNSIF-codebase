package com.tns.D8.Abstraction;

public abstract class Shape {
	protected float area;
	
	//abstract method
	public abstract void calArea();
	
	//solid method
	public void show()
	{
		System.out.println("Area of the shape is:" + area);
		
	}
	
	

}
