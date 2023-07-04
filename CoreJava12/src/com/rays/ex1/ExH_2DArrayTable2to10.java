package com.rays.ex1;

public class ExH_2DArrayTable2to10 {
	public static void main(String[] args)
	{
		int [][] table = new int [9][10];
		for (int i = 0; i<table.length; i++)
		{
			for (int j = 0; j<table.length; j++)
			{
				for (int k = 1; k<=10; k++)
				{
					for (int l = 2; l<=10; l++ )
					{
						table[i][j]=l*k;
						System.out.print(table[i][j]+"\t");
						if((k==10)&&(l==10))
						{
							break;
						}
					}
					
					System.out.println();
				}break;
				
			}break;
			
		}
	}

}
