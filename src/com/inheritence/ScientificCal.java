package com.inheritence;

public class ScientificCal extends Calculator {
 
	void power(int a, int b) {
		System.out.println(Math.pow(a, b));
	}
	public static void main(String[] args) {
		ScientificCal sc = new  ScientificCal();
		sc.add(4, 6);
		sc.power(6, 2);
		
	}
}
