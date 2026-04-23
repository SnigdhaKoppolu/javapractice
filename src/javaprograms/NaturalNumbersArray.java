package javaprograms;

import java.util.Arrays;


public class NaturalNumbersArray {
		  
	    public static int[] getNaturalNumbers(int size) {
	        int[] numbers = new int[size]; 
	        for (int i = 0; i < size; i++) {
	            
	            numbers[i] = i + 1; 
	        }
	        
	        return numbers;
	    }

	    public static void main(String[] args) {
	        int limit = 10;
	        
	        int[] resultArray = getNaturalNumbers(limit);

	        System.out.println("Natural Numbers: " + Arrays.toString(resultArray));
	    }

}
