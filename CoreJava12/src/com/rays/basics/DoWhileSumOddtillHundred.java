package com.rays.basics;

public class DoWhileSumOddtillHundred
{
	public static void main (String[] args)
	{
		int i = 1;
		int sum = 0;
		do
		{
			sum = sum+i;
			i=i+2;
		}
		while(i<=99);
		System.out.println("Sum of all Odd numnbers from 1 to 99 is = "+sum);
	}

}
