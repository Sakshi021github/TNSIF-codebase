package com.tns.D9.Array;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student s=new Student(0,null)
				Student [] arr;
		
		//declared memory for 5 object
		arr=new Student[5];
		
		arr[0]=new Student(101,"Heti");
		arr[1]=new Student(102,"Jeel");
		arr[2]=new Student(103,"Riva");
		arr[3]=new Student(104,"Eva");
		arr[4]=new Student(105,"Reva");
		arr[5]=new Student(106,"Ovi");
		
		for(int i=0;i<=arr.length;i++) {
			System.out.println("Element at"+ i+":"+arr[i].getRollNo()+"\t"+arr[i].getName());
			
		}
		
		
		

	}

}
