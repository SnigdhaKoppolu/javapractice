package javaprograms;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the limit (n): ");
		        int n = sc.nextInt();
		        
		        int sum = 0;
		        for (int i = 1; i <= n; i++) {
		            sum += i; // Adding each number to the sum
		        }
		        
		        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
		        sc.close();
		    }
		}

	