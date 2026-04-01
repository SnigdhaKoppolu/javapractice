package javaprograms;

public class ContinueBreak {

	public static void main(String[] args) {
		
		        System.out.println("Starting the loop from 1 to 10...");

		        for (int i = 1; i <= 10; i++) {
		            
		            if (i == 5) {
		                System.out.println("Skipping number 5 because of 'continue'");
		                continue; // Skips the rest of this iteration and jumps to i = 6
		            }

		            if (i == 8) {
		                System.out.println("Stopping the loop at 8 because of 'break'");
		                break; // Exits the loop entirely
		            }

		            System.out.println("Current number: " + i);
		        }

		        System.out.println("Loop is finished.");
		    }
		}

	