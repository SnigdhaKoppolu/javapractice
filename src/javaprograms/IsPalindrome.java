package javaprograms;

public class IsPalindrome {
	

	    public static boolean isPalindrome(String str) {
	        // StringBuilder has a built-in reverse method
	        String reversed = new StringBuilder(str).reverse().toString();
	        return str.equalsIgnoreCase(reversed); 
	    }

	    public static void main(String[] args) {
	        String testWord = "Racecar";
	        
	        if (isPalindrome(testWord)) {
	            System.out.println(testWord + " is a palindrome.");
	        }
	    }
	}

