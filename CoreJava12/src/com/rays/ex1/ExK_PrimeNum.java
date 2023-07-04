package com.rays.ex1;

public class ExK_PrimeNum
{
	public static void main(String[] args)
	{
		int n = 17;
		int count = 0;
		int r = 0;
		for(int i = 2; i<n; i++)
		{
			r=n%i;
			if(r==0)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("The given number "+n+" is not a Prime Number");
		}
		else
		{
			System.out.println("The given number "+n+" is a Prime Number");
		}
	}
}
