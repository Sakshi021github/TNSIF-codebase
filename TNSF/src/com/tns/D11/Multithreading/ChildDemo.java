package com.tns.D11.Multithreading;

public class ChildDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread c=new ChildThread(10,"Hello");
		ChildThread c1=new ChildThread(10,"Hello");
		
		c.start();
		c1.start();
		System.out.println("End of the program");

	}

}
