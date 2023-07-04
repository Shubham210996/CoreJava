package com.rays.ex1;

public class ExG_SumDivisibleby7 {
	public static void main(String[] args)
	{
		int r = 0;
		int sum = 0;
		for(int i = 100; i<=200; i++)
		{
			r=i%7;
			if(r==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of all the numbers which are divisible by 7 is = "+sum);
	}
}
