package com.jumpstatements;

public class BreakContinuereturn {

	public static void main(String[] args) {
		
		        System.out.println("--- Starting Search Process ---");
		        processNumbers(1, 100);
		        System.out.println("--- Process Finished ---");
		    }

		    public static void processNumbers(int start, int end) {
		        for (int i = start; i <= end; i++) {
		            
		            // Skip the number 3
		            if (i == 3) {
		                System.out.println("Skipping 3 (Continue)");
		                continue; 
		            }

		           // Stop the loop if we hit 7
		            if (i == 7) {
		               System.out.println("Breaking at 7 (Break)");
		                break; 
		                }
		            
		            // RETURN (Conditional): Emergency exit if number is 100
		            if (i == 100) {
		                return; 
		            }

		            System.out.println("Processing number: " + i);
		        }
		        
		        System.out.println("This message prints because we used 'break', not 'return'.");
		    }
		    
}
