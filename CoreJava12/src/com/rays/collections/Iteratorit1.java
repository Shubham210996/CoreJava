package com.rays.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iteratorit1 {
	public static void main(String [] args)
	{
		Collection c = new ArrayList();
		c.add("Raju");
		c.add("Dil");
		c.add("Awaj");
		
//		Iterator it = c.iterator();
//		while(it.hasNext())
//		{
//			Object o = it.next();
//			System.out.println(o);
//		}
		Iterator it1 = c.iterator();
		while(it1.hasNext())
		{
			String s = (String) it1.next();
			if(s == "Raju")
			{
				it1.remove();
			}
			else
			{
				Object o1 = s;
				System.out.println(o1);
			}
		}
	}
}
