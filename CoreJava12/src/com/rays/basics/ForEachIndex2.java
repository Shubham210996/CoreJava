package com.rays.basics;

public class ForEachIndex2 
{
	public static void main(String[] args)
	{
		int j=0;
		int [] Customer = {23,35,14,25,36,74,85,96,17,28,39,71,82,93,47,59,15,28,30,9,86,64,51,54,57,58,59,56,53,52};
		System.out.println("The Length of Customer Array is "+Customer.length);
		System.out.println();
		
				for( int i : Customer)
					{
						System.out.println("The Value of Customer Array at index "+j+" is = "+i);
						j++;
					}			
	}
}