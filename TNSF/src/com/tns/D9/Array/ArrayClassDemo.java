package com.tns.D9.Array;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get the array
		int intArr[]= {68,20,12,20,50};
		//print the array
		System.out.println(Arrays.toString(intArr));
		
		for(int i=0;i<intArr.length;i++)
		{
			System.out.println(intArr[i]+" ");
		}
		System.out.println();
		
		//sort
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		//binary search
		System.out.println(Arrays.binarySearch(intArr, 50));
		
		//comparison
		System.out.println(Arrays.toString(intArr));
		
		//get the second array
		int intArr1[]= {68,20,12,20,50};
		Arrays.sort(intArr1);
		System.out.println(Arrays.toString(intArr1));
		
		
		//cpmparison both the array
		
		
			
			
			
	//copy of array
		int intArr2[]=Arrays.copyOf(intArr,2);
		System.out.println(Arrays.toString(intArr2));
		
		int intArr3[]=Arrays.copyOfRange(intArr1, 2, 4);
		System.out.println(Arrays.toString(intArr3));
		
		//fill method
		Arrays.fill(intArr3, 7);
		System.out.println(Arrays.toString(intArr3));
		
		
		
	
		
		

	}

}
