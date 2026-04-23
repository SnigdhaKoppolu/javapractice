package javaprograms;

public class PalindromeCheck {

     
    public static int reverseNumber(int n) {
        int reversedNum = 0;
        
        while (n != 0) //Handles both positive and negative numbers
        {
            int remainder = n % 10;
            reversedNum = (reversedNum * 10) + remainder;
            n = n / 10;
        }
        return reversedNum;
    }
	public static void main(String[] args) {

		        int originalNumber = 1221;
		        
		        //  Calling the method to get the reversed value
		        int reversedResult = reverseNumber(originalNumber);
		        
		        System.out.println("Original Number: " + originalNumber);
		        System.out.println("Reversed Number: " + reversedResult);

		        //  The "Test" logic: Comparing original with reversed
		        if (originalNumber == reversedResult) {
		            System.out.println("Is Palindrome: Yes");
		        } else {
		            System.out.println("Is Palindrome: No");
		        }
		    }
		}


