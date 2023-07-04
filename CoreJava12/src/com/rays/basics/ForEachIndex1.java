package com.rays.basics;

public class ForEachIndex1
{
	public static void main (String[] args)
	{
		int [] Master = {23,35,47,59,15,28,12,32,45,65,78,98,30,9,86,6415,35,75,95,51,53,57,59,24,26,84,86,42,62,48,68};
		int j = 0;
			
				for(int i : Master)
				{
					System.out.println("The Value of Master Array at index "+j+" is = "+i);
					j++;
				}
			
	}
}
