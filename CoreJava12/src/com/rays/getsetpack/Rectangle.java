package com.rays.getsetpack;

public class Rectangle {
	private int length;
	private int width;

	public void setLW(int l, int w)
	{
		length = l;
		width = w;
	}
	public double getLW()
	{ 
		int ar=0;
		ar=2*(length+width);
		return ar;
	}
}
