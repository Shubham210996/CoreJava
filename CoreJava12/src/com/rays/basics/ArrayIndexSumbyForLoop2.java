package com.rays.basics;

public class ArrayIndexSumbyForLoop2
{
	public static void main (String[] args)
	{
		int sum = 0;
		int [] UserSum = {23,35,47,59,15,100,200,40,60,80,400,800,28,30,9,86,64,20,40,60,80,100,23,35,47,59,15,28,30,9,86,64};
		System.out.println("The Length of the UserSum Array is = "+UserSum.length);
		for(int i = 0; i<UserSum.length ; i++)
		{
			sum = sum + UserSum[i];
		}
		System.out.println("The Sum of all the Values of Array is = "+sum);
	}

}
