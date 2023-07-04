package com.rays.constructors;

public class Rectangle {
	
	private int length = 0;
	private int width = 0;
	
	public Rectangle()
	{
		//This is a Default Constructor
	}
	public Rectangle(int l, int w)
	{
		double area;
		this.length = l;
		this.width = w;
		area = 2*(length+width);
		System.out.println("Area of Rectangle is : "+area);
	}
}
