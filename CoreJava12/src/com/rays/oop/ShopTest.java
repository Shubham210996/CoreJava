package com.rays.oop;

public class ShopTest {
	public static void main(String[] args)
	{
		Shop s = new Shop();
		s.setColor("Red");
		System.out.println(s.getColor());
		s.setBorderWidth(10);
		System.out.println(s.getBorderWidth());
	}
}