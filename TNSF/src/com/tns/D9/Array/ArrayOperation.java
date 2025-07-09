package com.tns.D9.Array;

public class ArrayOperation {
	//print int array
	static void printArray(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+ "\t");
			System.out.println();
		}
	}
	
	//variable argument function
	public static int  getSum(int...n)
	{
		int  sum=0;
				for(int no:n)
					sum +=no;
				return sum;
	}
	
	//count number of odd elements
	public static int getOddCount(int b[])
	{
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i] % 2 !=0)
		
			count++;
	}
	return count;
	}
	
	//count no.even elements
	
	
}

