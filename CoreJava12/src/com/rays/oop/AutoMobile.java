package com.rays.oop;

public class AutoMobile {
	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 6;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	public int changeGear(int gear)
	{
		return 0;
	}
}
