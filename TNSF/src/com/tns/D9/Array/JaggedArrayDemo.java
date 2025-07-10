package com.tns.D9.Array;

class JaggedArray{
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

public class JaggedArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][]= { {10,20,30}, {11,12}, {1}, {1,2,3},{2,3,4,5} };
		System.out.println("No of rows in c array:"+c.length);
JaggedArray.printArray(c);
		

	}

}
