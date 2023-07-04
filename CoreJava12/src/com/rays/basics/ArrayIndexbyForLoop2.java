package com.rays.basics;

public class ArrayIndexbyForLoop2
{
	public static void main (String[] args)
	{
		int [] arrayvalues= {100,200,400,800,1600,3200,6400,12800,25600,512000};
		
		for(int i = 0; i<10; i++)
		{
			System.out.println("Value of Array at Index "+i+" is = "+arrayvalues[i]);
		}
	}

}
