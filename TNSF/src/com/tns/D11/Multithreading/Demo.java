package com.tns.D11.Multithreading;

public class Demo {

	public static void main(String[] args) {
		
		Thread myThread=new ThreadLifeCycleDemo();
		
		System.out.println("Before runnable state thread is alive or not?"+ myThread.isAlive());
		
		myThread.start();
		
		try {
			Thread.sleep(450);
		}
		catch(InterruptedException e)
		{
			System.err.println(e.getMessage());
			
		}
		System.out.println("After completion execution, it is alive or not?"+ myThread.isAlive());
		

	}

}
