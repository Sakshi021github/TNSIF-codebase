package com.tns.D8.Interface;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount s1=new SavingAccount("Zee1", "Pune", 12345688,36000);
		s1.deposit(40000);
		System.out.println(s1);
		
		s1.withdraw(3500);
		System.out.println(s1);
		
		s1.withdraw(10000);
		System.out.println(s1);

		
	}

}
