package com.rays.ex1;

public class ExP_2ndLargeinArray {
	public void Large2nd(int [] a)
	{
		int max = a[0];
		int max2 = 0;
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max2=max;
				max=a[i];
			}
		}
		System.out.println("Largest Number in Array is = "+max);
		System.out.println("2nd Largest Number in Array is = "+max2);
	}
}
