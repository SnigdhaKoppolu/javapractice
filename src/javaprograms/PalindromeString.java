package javaprograms;

public class PalindromeString {

	public static void main(String[] args) {
		String s1= "racecar";
		String rev= "";
		for(int i=s1.length()-1; i>=0; i--)
		{
			char ch = s1.charAt(i);
			rev = rev+ch;
		}
		System.out.println(rev);
		
		if(s1.equals(rev))
		{
			System.out.println("String is palindrome  " + rev);
		}
		else
		{
			System.out.println("String is not palindrome  " +rev);
		}
	}

}
