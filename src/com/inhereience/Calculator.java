package com.inhereience;

public class Calculator {

	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void sub(int a, int b) {
		System.out.println(a-b);	
	}
	
	void mul(int a, int b) {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		
     Calculator cal = new Calculator();
     cal.add(7, 4);
     cal.sub(11, 2);
     cal.mul(3, 5);
	}

}
