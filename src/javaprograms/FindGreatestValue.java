package javaprograms;

public class FindGreatestValue {
	
	    public static int getGreatest(int[] arr) {
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i]; 
	            }
	        }
	        return max;
	    }

	    public static void main(String[] args) {
	        int[] prices = {450, 999, 120, 1500, 750};

	        int maxPrice = getGreatest(prices);

	        System.out.println("The greatest value is: " + maxPrice);
	    }
	}
