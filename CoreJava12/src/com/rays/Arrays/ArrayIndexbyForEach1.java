package com.rays.Arrays;

public class ArrayIndexbyForEach1 {
	public static void main(String[] args)
	{
		int[] Candidates = new int [5];
		for(int i: Candidates)
		{
			Candidates[i] = i+2;
		}
		for(int i=0; i<Candidates.length; i++)
		{
			System.out.println("Value at Index "+i+" is = "+Candidates[i]);
		}
	}

}
