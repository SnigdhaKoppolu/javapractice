package javaprograms;

public class ArrayMinMax {
	
	    // Find the Highest Value
	    public static int getGreatest(int[] arr) {
	        int max = arr[0]; 
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }

	    // Find the Lowest Value
	    public static int getSmallest(int[] arr) {
	        int min = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        return min;
	    }

	    public static void main(String[] args) {
	        int[] productPrices = {1200, 450, 890, 3200, 750};

	        System.out.println("Greatest Price: " + getGreatest(productPrices));
	        System.out.println("Smallest Price: " + getSmallest(productPrices));
	    }
}
