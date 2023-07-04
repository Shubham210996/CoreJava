package com.rays.Arrays;

public class Array2Dtable {
	public static void main (String[] args)
	{
		int [][] table = new int [11][11];
		for(int i=0; i<table.length; i++)
		{
			for(int j=0; j<table.length; j++)
			{
				if(i>0&&j>0)
				{
				table[i][j]=i*j;
				System.out.print(table[i][j]+"\t");
				}
			}
			if(i>0)
			{
			System.out.println();
			}
		}
	}
}
