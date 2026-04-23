package javaprograms;
import java.util.Scanner; 

public class Palindrome {

	    public static int reverseNumber(int n) {
	        int reversedNum = 0;
	        while (n != 0) {
	            int remainder = n % 10;
	            reversedNum = (reversedNum * 10) + remainder;
	            n = n / 10;
	        }
	        return reversedNum;
	    }

	    public static void main(String[] args) {
	        // 2. Create a Scanner object
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number to check: ");
	        
	        // 3. Read the input from the user
	        int inputNumber = sc.nextInt(); 
	        
	        int reversedResult = reverseNumber(inputNumber);
	        
	        System.out.println("Original Number: " + inputNumber);
	        System.out.println("Reversed Number: " + reversedResult);

	        if (inputNumber == reversedResult) {
	            System.out.println("Is Palindrome: Yes");
	        } else {
	            System.out.println("Is Palindrome: No");
	        }

	        sc.close(); 
	    }
	}
