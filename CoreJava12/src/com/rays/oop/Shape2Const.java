package com.rays.oop;

public class Shape2Const 
{
	private String color;
	private int borderWidth;
	
	public Shape2Const()
	{
		System.out.println("This is a Default Constructor");
	}
	public Shape2Const(String color, int borderWidth)
	{
		this.color = color;
		this.borderWidth = borderWidth;
		System.out.println(this.color);
		System.out.println(this.borderWidth);
	}
	public String getColor()
	{
		return color;
	}
	public int getBorderWidth()
	{
		return borderWidth;
	}
}
