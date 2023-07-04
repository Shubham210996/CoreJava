package com.rays.ex1;

public class ExC_Randombt1to100 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			double a = Math.random();
			a = a * 100;
			long b = (long) (a + 0);
			if (b >= 1 && b < 101) {
				System.out.println("Random number "+i+" is = " + b);
			}
		}
	}
}