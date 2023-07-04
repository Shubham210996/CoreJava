package com.rays.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CustomMain {
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.setName("Rishika");
		e1.setAcType("Personal");
		e1.setAge(27);
		e1.setId("1232132");
		
		Custom c1 = new Custom();
		c1.setId(1);
		c1.setName("Shubham Prajapati");
		c1.setAge(27);
		c1.setColor("Red");
		
		Custom c2 = new Custom();
		c2.setId(2);
		c2.setName("Jyoti Kanel");
		c2.setAge(18);
		c2.setColor("Red");
		
		LinkedList coll1 = new LinkedList();
		ArrayList coll2 = new ArrayList();
		ArrayList coll3 = new ArrayList();
		coll1.add(c1);
		coll2.add(c2);
		coll3.add(e1);
	//	System.out.println(coll1);
	//	System.out.println();
		
		Iterator it1 = coll1.iterator();
		while(it1.hasNext())
		{
			Custom c = (Custom) it1.next();
			//System.out.println(c);
		}
		
		Iterator it2 = coll3.iterator();
		while(it2.hasNext())
		{
			Employee e2 = (Employee)it2.next();
			System.out.println("This is Collection 3 : "+e1);
		}
		
	}
}
