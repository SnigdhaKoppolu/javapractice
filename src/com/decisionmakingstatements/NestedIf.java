package com.decisionmakingstatements;

public class NestedIf {

	public static void main(String[] args) {
		int n= 87;
		if(n>=35) {
			System.out.println("status : pass");
		
		if(n>=90) {
			System.out.println("grade outstanding");
		}
		else if(n>=75) {
			System.out.println("grade A");
		}
		else if(n>=60) {
			System.out.println("grade B");
		}
		else {
			System.out.println("grade C");
		}
		}
		else {
			System.out.println("status : fail");
		}
	}
}

