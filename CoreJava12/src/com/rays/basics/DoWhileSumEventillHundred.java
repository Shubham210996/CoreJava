package com.rays.basics;

public class DoWhileSumEventillHundred
{
	public static void main (String[] args)
	{
		int i = 2;
		int sum = 0;
		do
		{
			sum = sum+i;
			i=i+2;
		}
		while(i<=100);
		System.out.println("Sum of all Even numbers from 2 to 100 is = "+sum);
	}

}
