package com.rays.getsetpack;

public class ShapeMain {
	public static void main(String[] args)
	{
		Circle c = new Circle();
		c.setArea(5);
		System.out.println("Area of Circle = "+c.getArea());
		Rectangle r = new Rectangle();
		r.setLW(5, 2);
		System.out.println("Area of Rectangle = "+r.getLW());
		Triangle t = new Triangle();
		t.setArea(4, 6);
		System.out.println("Area of a Triangle = "+t.getArea());
	}
	
}
