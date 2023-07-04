package com.rays.level2;

public class Reverse2 {
	public static void main(String[] args)
	{
		int n1=15647,r,rev=0;
		for(int n2=n1;n2>0;n2=n2+0)
		{
			r=n2%10;
			rev=rev*10+r;
			n2=n2/10;
		}
		System.out.print("Reverse = "+rev);
	}

}
