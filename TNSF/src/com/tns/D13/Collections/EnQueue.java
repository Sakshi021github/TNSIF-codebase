package com.tns.D13.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;



public class EnQueue {

	public static void main(String[] args) {
		
		Queue<Integer> r=new LinkedList<Integer>();
		
		r.add(6);
		r.add(10);
		r.add(20);
		r.add(13);
		r.add(2);
		
		System.out.println(r);
		
		int positionPeeker=r.peek();
		System.out.println("using peek method");
		
		int positionelement=r.element();
		System.out.println("using element method fisrt value ");
		
		System.out.println(r.remove(r));
		System.out.println(r);
		
		Iterator itr=r.iterator();
		while(itr.hasNext())
		{
			System.out.println();
		}
		
		
		
		
	}

}
