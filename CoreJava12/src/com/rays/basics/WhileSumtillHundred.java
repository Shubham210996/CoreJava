package com.rays.basics;

public class WhileSumtillHundred
{
	public static void main (String[] args)
	{
		int i=1;
		int sum=0;
		while(i<=100)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of all numbers from 1 to 100 is = "+sum);
	}

}
