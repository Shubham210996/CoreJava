package com.rays.Object;

public class MethoLarge {
	public void large(int[] n)
	{
		int max=n[0];
		for(int i=1; i<n.length; i++)
		{
			if(n[i]>max)
			{
				max=n[i];
			}
		}
		System.out.println("Largest Number in given Array is = "+max);
	}
}
