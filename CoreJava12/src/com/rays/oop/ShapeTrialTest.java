package com.rays.oop;

public class ShapeTrialTest {
	public static void main(String[] args)
	{
		ShapeTrial s1 = new ShapeTrial();
		s1.setAreaRec(5);
		s1.setBorderWidth(6);
		s1.setColor("Shubham & Jyoti");

		System.out.println(s1.getAreaRec());
		System.out.println(s1.getBorderWidth());
		System.out.println(s1.getColor());
	}
}
