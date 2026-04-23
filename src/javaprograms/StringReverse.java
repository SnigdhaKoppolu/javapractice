package javaprograms;

public class StringReverse {

	public static void main(String[] args) {
	String  original = "madam"; 
	String reversed = "";
	
	// We start at the last character and move to the first
	for (int i = original.length() - 1; i >= 0; i--) {
	    reversed = reversed + original.charAt(i);
	}
	System.out.println(reversed);

	//  Use .equals() for Strings, not ==
	if (original.equals(reversed)) {
	    System.out.println("Palindrome: Yes");
	}
	}
}



   


	
	
