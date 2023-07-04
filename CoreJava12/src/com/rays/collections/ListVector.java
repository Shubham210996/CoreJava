package com.rays.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListVector {
	public static void main (String[] args)
	{
		Vector l = new Vector();
		l.add("Rani");
		l.add("Ravina");
		l.add("Lisa");
		l.add("Leena");
		l.add("Lakshya");
		
		Iterator it = l.iterator();
		while(it.hasNext())
		{
			String str = (String) it.next();
			System.out.println(str);
		}
		
		System.out.println();
		
		Enumeration ert = ((Vector) l).elements();
		while(ert.hasMoreElements())
		{
			String str1 = (String) ert.nextElement();
			System.out.println(str1);
		}
		
	}
}
