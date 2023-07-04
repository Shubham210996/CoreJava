package com.rays.constructors;

public class Circle {
	private int radius;
	private final double PI = 3.14;
	
	public Circle()
	{
		
	}
	public Circle(int r)
	{
		radius = r;
		System.out.println("Area of Circle is = "+(PI*radius*radius));
		System.out.println("Circumference of Circle is = "+2*PI*radius);
	}
	
}
