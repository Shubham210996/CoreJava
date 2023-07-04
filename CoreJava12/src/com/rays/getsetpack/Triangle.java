package com.rays.getsetpack;

public class Triangle {
	private int base;
	private int height;
	
	public void setArea(int b, int h)
	{
		base = b;
		height = h;
	}
	public double getArea()
	{
		double ar;
		ar=0.5*base*height;
		return ar;
	}
}
