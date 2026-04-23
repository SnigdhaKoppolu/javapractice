package javaprograms;

public class SmallestValue {
	public static void main(String[] args) {
		
	int[] arr = {15, 5, 20, 8, 2};
	int min = arr[0] ; 

	for (int i = 1; i < arr.length; i++) {
	    if (arr[i] < min) { 
	        min = arr[i];  
	    }
	}

	System.out.println("Smallest: " + min);
}
}

