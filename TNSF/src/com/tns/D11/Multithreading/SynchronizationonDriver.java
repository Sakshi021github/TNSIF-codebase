package com.tns.D11.Multithreading;

public class SynchronizationonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account heti=new Account(1001, "Heti", 56000);
		System.out.println(heti);
		//heti.withdraw(7654);
		
		AccountThread t[]=new AccountThread[10];
		for(int i=0;i<10;i++) {
			t[i]=new AccountThread(heti,45000);
		}
		try {
			for(int i=0;i<10;i++)
			{
				t[i].join();
			}
		}
		catch(InterruptedException e)
		{
			System.err.println(e.getMessage());
			
		}
		System.out.println("------------");
		System.out.println(heti);

		
	}

}