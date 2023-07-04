package com.rays.basics;

public class ForSumEventillHundred
{
	public static void main(String[] args)
	{
		int sum=0;
		for (int i=2;i<=100;i=i+2)
		{
			sum=sum+i;
		}
		System.out.println("Sum of Even Numbers from 2 to 100 is = "+sum);
	}

}
