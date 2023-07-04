package com.rays.oop;

public class ShapeTrial {
	private String color = null;
	private int borderWidth = 0;
	private double areaRec = 0;
	
	public void setColor(String s)
	{
		color = s;
	}
	public void setBorderWidth(int i)
	{
		borderWidth = i;
	}
	public void setAreaRec(int Ar)
	{
		areaRec = Ar;
	}
	public String getColor()
	{
		return color;
	}
	public int getBorderWidth()
	{
		return borderWidth;
	}
	public double getAreaRec()
	{
		return areaRec;
	}
}
