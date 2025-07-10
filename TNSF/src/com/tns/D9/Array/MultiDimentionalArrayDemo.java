package com.tns.D9.Array;
class MLArray{
	static void printArray(int c[][]) {
		System.out.println("Array of elements are as follows");
		for(int i=0;i<=c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.println(c[i][j]+"");
			}
		}
	}
}
public class MultiDimentionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c[][]= { {12,13}, {10,20,30}, {1,2}, {11,12} };
		System.out.println("No of rows in c array:"+c.length);
MLArray.printArray(c);
		

	}

}
