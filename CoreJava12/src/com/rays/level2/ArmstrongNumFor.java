package com.rays.level2;

public class ArmstrongNumFor
{
	public static void main (String[] args)
	{
		 int num = 153;
		 int sum = 0;
		 int rem;
		 for(int n = num; n>0 ; n=n+0)
		 {
			 rem=n%10;
			 sum=sum+(rem*rem*rem);
			 n=n/10;
		 }
		 if(sum==num)
		 {
			 System.out.println("This number "+num+" is a Armstrong Number");
		 }else
		 {
			 System.out.println("This number "+num+" is not a Armstrong Number");
		 }
	}

}
