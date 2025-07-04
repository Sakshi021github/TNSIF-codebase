package com.tns.D2;

public class Operationdemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		
		System.out.println("A and B value before the operator:" + a + " " + b);
		
		++a;
		
		int e= ++a + b + a--;
		System.out.println("C value after the operator:" +e);
		
		int d= c++ + a + b--;
		System.out.println("D value after the operation:"+d);
		
		
		
	}
	

}
