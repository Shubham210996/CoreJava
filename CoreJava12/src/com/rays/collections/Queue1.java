package com.rays.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
	public static void main(String[] args) {
		Queue qc1 = new PriorityQueue();
		qc1.add("One");
		qc1.add("Three");
		qc1.add("Six");
		qc1.add("Two");
		qc1.add("Five");
		qc1.add("Seven");
		qc1.add("Four");
		
		System.out.println(qc1);
		System.out.println();
		qc1.add("Six");
		qc1.add("Six");
		qc1.add("Six");
		qc1.add("Six");
		qc1.add("Six");
		System.out.println(qc1);
	}
}
