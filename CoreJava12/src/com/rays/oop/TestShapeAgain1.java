package com.rays.oop;

public class TestShapeAgain1 {
	public static void main(String[] args) {
		
		ShapeAgain1 s;
		s = new ShapeAgain1();
		
		s.setColor("Red");
		s.setBorderWidth(35);
		
		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());
		System.out.println();
		System.out.println(s.PI);
		System.out.println(ShapeAgain1.PI);
		
	}
}
