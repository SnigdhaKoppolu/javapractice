package com.jumpstatements;

import java.util.Scanner;

public class Return {
	
	public static void main (String[] args) {
		/*System.out.println("Checking eligibility criteria for voting");
		checkEligibility(27);
	     }
		public static void checkEligibility(int age) {
			if(age <18)
			{
				System.out.println("Not-eligible for vote");
				return;
			}
			System.out.println("Eligible for vote");
			*/
		  
			        try( Scanner sc = new Scanner(System.in)){
			            System.out.println("Checking eligibility criteria for voting");
			            System.out.print("Please enter your age: ");
			            int inputAge = sc.nextInt();
			            checkEligibility(inputAge);
			           }
			        }
			    public static void checkEligibility(int age) {
			        if (age < 18) {
			            System.out.println("Not-eligible for vote");
			            return; // Exits the method immediately
			        }
			        System.out.println("Eligible for vote");
	      }
	   }

