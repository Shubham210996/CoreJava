package com.rays.ex1;

public class ExJ_Armstrong {
	public static void main(String[] args)
	{
		int num = 153;
		int sum=0;
		int r=0;
		for(int n=num; n>0; n=n+0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==num)
		{
			System.out.println("The given number "+num+" is an Armstrong Number");
		}
		else
		{
			System.out.println("The given number "+num+" is not an Armstrong Number");
		}
	}
}
