package com.tns.D8.Interface;

public class NestedDemo implements OuterInterface, OuterInterface.InnerInterface{
	
	public void calArea() {
		System.out.println("Outer Interface");
	}
	
	public void print() {
		System.out.println("Inner Interface");
	}

}
