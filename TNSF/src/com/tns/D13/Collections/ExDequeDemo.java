package com.tns.D13.Collections;

import java.util.Deque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayDeque;

public class ExDequeDemo {

	public static void main(String[] args) {
		
		Deque<String> deque1=new ArrayDeque<String>();
		deque1.add("Gautam");
		deque1.add("kiran");
		deque1.add("mansi");
		deque1.add("veera");
		deque1.add("vaani");
		
		System.out.println(deque1);
		
		deque1.pollLast();
		System.out.println(deque1);
		
		deque1.pollFirst();
		System.out.println(deque1);
		
		for(String str : deque1)
		{
			System.out.println("deque is"+ str);
		}
		System.out.println(deque1);
		
		

	}

}
