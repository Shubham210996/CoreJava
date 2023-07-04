package com.rays.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LionMain {
	public static void main (String [] args)
	{
		Lion l = new Lion();
		l.setAcNum(9131073);
		l.setName("Shubham Prajapati");
		l.setFatherName("Nanuram Prajapati");
		l.setMotherName("Pramila Prajapati");
		
		 ArrayList coll1 = new ArrayList();
		  coll1.add(l);
//		  System.out.println(coll1.get(0));
//		  coll1.add(1 , "Saving Account");
//		  System.out.println(coll1.get(1));
		 
//		 Object obj = coll1.get(1);
//		 System.out.println(obj);
//		 System.out.println();
//		 System.out.println("Iterator Output : ");
		 
		Iterator it = coll1.iterator();
		while(it.hasNext())
		{
			Lion lm = (Lion) it.next();
			System.out.println(lm.getName());
			System.out.println(lm.getFatherName());
			System.out.println(lm.getMotherName());
			System.out.println(lm.getAcNum());
		}
	}
}
