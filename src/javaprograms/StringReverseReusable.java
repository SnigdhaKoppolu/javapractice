package javaprograms;

public class StringReverseReusable {

	    public static boolean isPalindrome(String original) {
	        String reversed = "";
	        
	        for (int i = original.length() - 1; i >= 0; i--) {
	            reversed = reversed + original.charAt(i);
	        }
	        
	        // return true if they match, false if they don't
	        return original.equalsIgnoreCase(reversed);
	    }

	    public static void main(String[] args) {
	        
	        String word1 = "madam";
	        String word2 = "selenium";

	        // validating word1
	        if (isPalindrome(word1)) {
	            System.out.println(word1 + " is a Palindrome");
	        } else {
	            System.out.println(word1 + " is not a Palindrome");
	        }

	        // validating word2
	        if (isPalindrome(word2)) {
	            System.out.println(word2 + " is a Palindrome");
	        } else {
	            System.out.println(word2 + " is not a Palindrome");
	        }
	    }
	}

