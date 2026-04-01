package com.jumpstatements;

public class Break {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			if(i==3) {
				break;
			}
			System.out.println("Iteration: " +i);
		}
	}

}
