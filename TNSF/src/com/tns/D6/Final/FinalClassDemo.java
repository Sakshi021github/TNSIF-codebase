package com.tns.D6.Final;

final class FinalClass{
	void show()
	{
		System.out.println("Final class cannot be inherite");
	}
}

//class Student extends FinalClass{
	

public class FinalClassDemo {
	public static void main(String[]args) {
		FinalClass f=new FinalClass();
		f.show();
	}

}
