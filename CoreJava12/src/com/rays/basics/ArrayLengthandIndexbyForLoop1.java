package com.rays.basics;

public class ArrayLengthandIndexbyForLoop1 
{
	public static void main(String[] args)
	{
		int [] Score = {400,800,1600,3200,400,800,1600,3200,6400,23,35,47,6400,23,35,47,6400,23,35,47,6400,23};
		System.out.println("The Length of the Score Array is = "+Score.length);
		for(int i = 0; i<Score.length;i++)
		{
			System.out.println("The Value of Array at index "+i+" is = "+Score[i]);
		}
	}

}
