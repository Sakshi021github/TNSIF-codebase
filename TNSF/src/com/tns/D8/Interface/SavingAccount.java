package com.tns.D8.Interface;

public class SavingAccount extends Customer implements Bank {
	private int accNo;
	private float balance;
	
	//para constructor
	public SavingAccount(String city, String name, int accNo, float balance) {
		super(city, name);
		this.accNo = accNo;
		this.balance = balance;
	}
	
	//getter setter
	

	@Override
	public void deposit(float ammount) {
		if(ammount<0 || ammount> Deposit_Limit)
		{
			System.out.println("Please deposit valid ammount ");
		}
		else
		{
			balance+=ammount;
			System.out.println("Rs:" + ammount + "is deposited sucessfully");
		}
		
		
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public void withdraw(float ammount) {
		if(ammount<=balance-MINBAL)
		{
			balance-=ammount;
			System.out.println("Rs:"+ammount+"withdraw is successful");
		}
		else
		{
			System.out.println("Insufficient balance");
		}
		
		
		
		
	}
	
	//two string
    @Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + ", getAccNo()=" + getAccNo()
				+ ", getBalance()=" + getBalance() + ", getCity()=" + getCity() + ", getName()=" + getName() + "]";
	}
	
	
	
	

}
