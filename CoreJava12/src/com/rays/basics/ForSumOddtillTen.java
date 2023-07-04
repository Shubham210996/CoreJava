package com.rays.basics;

public class ForSumOddtillTen
{
	public static void main (String[] args)
	{
		int sum=0;
		for (int i=1;i<10;i=i+2)
		{
			sum=sum+i;
		}
		System.out.println("Sum of Odd Numbers from 1 to 9 is = "+sum);
	}

}
