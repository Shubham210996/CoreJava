package com.rays.basics;

public class ArrayLengthandIndexbyForLoop2
{
	public static void main (String[] args)
	{
		int [] Quantity = {100,200,400,800,1600,3200,6400,23,35,47,59,15,100,200,40,60,80,400,800,28,30,9,86,400,800,1600,3200,6400,23,35,47,12800,25600,512000,400,800,1600,3200,6400,23,35,4735,47,6400,23};
		System.out.println("The Length of the Quantity Array is = "+Quantity.length);
		for(int i = 0;i<=Quantity.length-1;i++)
		{
			System.out.println("The value of Score Array at index number "+i+" is = "+Quantity[i]);
		}
	}

}
