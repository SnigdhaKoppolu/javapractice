package javaprograms;

public class SearchNumber {
	
	    public static boolean isNumberPresent(int[] arr, int target) {
	        for (int i = 0; i < arr.length; i++) {
	            	            if (arr[i] == target) {
	                return true;
	            }
	        }
	        
	        return false;
	    }

	    public static void main(String[] args) {
	        int[] luckyNumbers = {10, 25, 47, 89, 33};
	        int searchFor = 47;
	        if (isNumberPresent(luckyNumbers, searchFor)) {
	            System.out.println("Status: Number " + searchFor + " exists in the array.");
	        } else {
	            System.out.println("Status: Number " + searchFor + " not found.");
	        }
	    }
	}
