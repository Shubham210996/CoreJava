package com.rays.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Learner {
	public static void main(String[] args) {
		int i = 0;
		ArrayList coll1 = new ArrayList();
		coll1.add("Jyoti Kanel");
		coll1.add("Kiran Kanel");
		coll1.add("Lalla Kanel");
		coll1.add("Sonti Kanel");
		coll1.add("Shubham Kanel");
		coll1.add("Megha Kanel");
		coll1.add("Nirmala Kanel");
		coll1.add("Chandu Kanel");
		
		coll1.add(8, "Roshani Kanel");
		coll1.add(7, "124");
		
	//	System.out.println("First Output : "+coll1);
	//	System.out.println();
		coll1.add(3, "Sonu Kanel");
		
	//	System.out.println("Second Output : "+coll1);
	//	System.out.println();
		coll1.remove(4);
	//	System.out.println("Third Output : "+coll1);
	//	System.out.println(coll1.size());
		
//		String str = (String) coll1.get(4);
//		System.out.println(str);
//		Collections.sort(coll1);
//		System.out.println(coll1);
//		System.out.println();
			Iterator it = coll1.iterator();
			while (it.hasNext())
			{
				Object O = it.next();
				if(O == "Nirmala Kanel" || O == "Megha Kanel" )
				{
					it.remove();
				}
				else {
				i = i+1;
				System.out.println(i+" "+O);
				}
			}
			
		//System.out.println();
		//System.out.println(coll1);
		//System.out.println(coll1.subList(0, 6));
			
	}
}
