package com.rays.getsetpack;

public class Circle {
	private int radius;
	
	public void setArea(int r)
	{
		radius = r;
	}
	public double getArea()
	{
		double ar;
		final double PI = 3.14;
		ar=PI*radius*radius;
		return ar;
	}
}
