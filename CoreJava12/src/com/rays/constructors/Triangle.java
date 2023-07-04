package com.rays.constructors;

public class Triangle {
	private int base ;
	private int height ;
	private final double half = 0.5;
	
	public Triangle()
	{
		
	}
	public Triangle(int b, int h)
	{
		this.base = b;
		this.height = h;
		System.out.println("Area of Triangle = "+half*base*height);
	}
}
