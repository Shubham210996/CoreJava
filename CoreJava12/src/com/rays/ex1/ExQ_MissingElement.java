package com.rays.ex1;

public class ExQ_MissingElement {
	public void misselem(int[]a,int[]b)
	{
		int count = 0;
		if(a.length-1==b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				for(int j=0; j<b.length; j++)
				{
					if(a[i] != b[j])
					{
						count++;
						if(count==b.length)
						{
							System.out.println("Missing Number is = "+a[i]);
						}
					}
				}
				count=0;
			}
		}else
		{
			System.out.println("Please enter the values in both arrays with right formation");
		}
	}
}