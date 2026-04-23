package javaprograms;

public class NumberReverse {

	public static void main(String[] args) {
		/*int n = 432;
		int remainder = 0;
        int reverse = 0;
        //while(n>0)
        while (n != 0)
        {
        	remainder = n % 10;
            reverse =reverse*10+remainder;
        	n=n/10;
        }
        System.out.println("Reversed number : " +reverse);
        
	}
		*/
	
	       int number = -874;
	        int rem = 0;
	        int rev = 0;

	        while (number != 0)
	          {
	            rem = number % 10;     
	            rev = rev * 10 + rem; 
	            number /= 10;                 
	        }

	        System.out.println("Reversed Number: " + rev);
}
	}


