package javaprograms;

import java.math.BigInteger;

public class Factorial100 {

	public static void main(String[] args) {
		        
		        BigInteger result = BigInteger.ONE;

		        System.out.println("Factorials of the first 100 numbers:");
		        System.out.println("------------------------------------");

		        for (int i = 1; i <= 100; i++) {
		            // Multiply current result by the next number
		            result = result.multiply(BigInteger.valueOf(i));
		            
		            // Print the result for each step
		            System.out.println(i + "! = " + result);
		        }
		    }
	}
