package com.tns.D11.Multithreading;

public class ThreadMethodsDemo {

	public static void main(String[] args) {
		
		ChildThread t1=new ChildThread(5,"First");
		ChildThread t2=new ChildThread(5,"Second");
		
		t1.start();
		t2.start();
		
		Thread.currentThread().setName("parent Thread"); //assigning name to main thread
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Current Thread:"+ Thread.currentThread());
		
		try {
			t1.join();
			t2.join();
			
		}
		catch(InterruptedException e)
		{
			Thread.currentThread().interrupt();
			System.err.println("Thread interrupt:"+ e.getMessage());
		}
		
		System.err.println("---- End of program");
		
		

	}

}
