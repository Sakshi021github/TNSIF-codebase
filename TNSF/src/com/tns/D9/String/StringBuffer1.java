package com.tns.D9.String;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string buffer length
		StringBuffer buffer=new StringBuffer("hellooo");
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		//appending and inserting into buffer
		String s;
		int a=42;
		buffer=new StringBuffer(40);
		s=buffer.append("a=").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		
		buffer=new StringBuffer(" I Java");
		buffer.insert(2, "Like");
		System.out.println(buffer);
		
		buffer.delete(3,6);
		System.out.println(buffer);
		
		System.out.println(buffer.reverse());
		
		

	}

}
