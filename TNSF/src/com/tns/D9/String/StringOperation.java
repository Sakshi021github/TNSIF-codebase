package com.tns.D9.String;

public class StringOperation {
	public static void main(String[]args) {
		
		//creating string using literals //pool memory// primitive
		
		String s1="TNSIF";
		String s2="TNSIF";
		
		//creating new string operator // heap memory //object
		String s3=new String("TNSIF");
		String s4=new String("TNSIF");
		
		//==equals 
		System.out.println("case 1:"+ (s1==s2));
		System.out.println("case 2:"+ (s1==s3));
		System.out.println("case 3:"+ (s2.equals(s1)));
		System.out.println("case 4:"+ (s2.equals(s4)));
		System.out.println("case 5:"+ (s3==s4));
		System.out.println("case 6:"+ (s3.equals(s4)));
		
		
	    System.out.println(s1.hashCode());
	    System.out.println(s2.hashCode());
	    System.out.println(s3.hashCode());
	    System.out.println(s4.hashCode());
	    
	    
	    //compare by using compareTo
	    System.out.println(s1.compareTo(s4));
	    System.out.println(s1.compareToIgnoreCase (s4));
	    
	    
	    
	    
		
		
	
		
		
		
		
	}

}
