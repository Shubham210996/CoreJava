package com.rays.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackList {
	public static void main(String[] args) {
		List stc= new Stack();
		stc.add(1);
		stc.add(2);
		stc.add(3);
		stc.add(4);
		stc.add(5);
		stc.add("One");
		stc.add("two");
		stc.add("Three");
		stc.add("Four");
		stc.add("Five");
		
		System.out.println(stc);
		System.out.println();
		System.out.println(stc.size());
		System.out.println();
		
//		for(Object o : stc)
//		{
//			System.out.println(o);
//		}
		for(int i=stc.size()-1; i>=0; i--)
		{
			System.out.println(stc.get(i));
		}
		
		System.out.println();
		
		Iterator it = stc.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
