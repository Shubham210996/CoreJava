package com.rays.String;

public class Str_to_Int_by_ParseInt {
	public static void main (String[] args)
	{
		int sum=0;
		int[] num = new int[2];
		{
			for (int i = 0 ; i<args.length; i++)
			num[i]	= Integer.parseInt(args[i]);
		}
		for(int i = 0; i<num.length; i++)
		{
			sum=sum+num[i];
		}
		System.out.println("Sum of two values passed through args = "+sum);
	}
}
