package com.tns.D10.Exception;

public class NestedtryCatch {
	
	public static void check()
	{
		String str="TNS";
		int slength=str.length();
		System.out.println("String length:"+slength);
		
		String anotherString=null;
		
		int y=6;
		try {
			//inner try block
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.err.println(e.getMessage());
				
			}
			System.out.println("String length:"+anotherString.length());
		}
		catch (NullPointerException e)
		{
			System.err.println(e.getMessage());
		}
	
		}
	}
			
			


