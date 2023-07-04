package com.rays.ex1;

public class ExR_IntPosition {
	public void intPos(int n, int[] ar)
	{
		int count = 0, num1=0, num2=0;
		for(int i = 0; i<ar.length; i++)
		{
			if(n==ar[i])
			{
				count = i+1;
				if(num1==0)
				{
				System.out.print("Position of the given Integer in Array is = "+count);
				num1=count;
				}
				if(count>num1)
				{
				System.out.print(","+count);
				}
			}else if(n!=ar[i])
			{
				num2++;
				if(num2==ar.length)
				{
					System.out.println("-1");
				}
			}
		}
	}
}
