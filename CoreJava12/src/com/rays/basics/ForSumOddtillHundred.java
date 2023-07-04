package com.rays.basics;

public class ForSumOddtillHundred
{
	public static void main (String[] args)
	{
		int sum=0;
		for (int i=1;i<=100;i=i+2)
		{
			sum=sum+i;
		}
		System.out.println("Sum of Odd Numbers from 1 to 99 is = "+sum);
	}

}
