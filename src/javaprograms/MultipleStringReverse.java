package javaprograms;

public class MultipleStringReverse {

	public static void main(String[] args) {
	        // Store strings in an Array
	        String[] words = {"madam", "racecar", "selenium"};

	        // Outer loop picks one word at a time from the array
	        for (String original : words) {
	            String reversed = "";

	            // Inner loop reverses the current word
	            for (int i = original.length() - 1; i >= 0; i--) {
	                //reversed = reversed + original.charAt(i);
	            	char ch = original.charAt(i);
	            	reversed = reversed + ch;
	            }
	            System.out.println(reversed);
	            
	            // Validation and Output
	            if (original.equals(reversed)) {
	                System.out.println(original + " reversed is: " + reversed + " => Palindrome: Yes");
	            } else {
	                System.out.println(original + " reversed is: " + reversed + " => Palindrome: No");
	            }
	        }
    	}
    }





