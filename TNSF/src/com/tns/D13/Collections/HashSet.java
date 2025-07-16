package com.tns.D13.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;



public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(20);
		set.add(10);
		System.out.println(set);
		boolean b=set.contains(20);
		System.out.println(b);
		
		boolean b2=set.isEmpty();
		System.out.println(b2);
		
		set.remove(20);
		System.out.println(set);
		
		Iterator<Integer> = i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+ " ");
		}
		
		

	}

}
