package com.rays.basics;

public class DoWhileSumtillHundred
{
	public static void main(String[] args)
	{
		int i=1;
		int sum=0;
		do
		{
			sum=sum+i;
			i++;
		}
		while(i<=100);
		System.out.println("Sum of all numbers from 1 to 100 is = "+sum);
	}

}
