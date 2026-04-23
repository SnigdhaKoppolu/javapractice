package javaprograms;

public class FindSmallestValueReusable {
	public class FindSmallest {
	    public static int getSmallest(int[] numbers) {
	        int min = numbers[0];
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < min) {
	                min = numbers[i];
	            }
	        }
	        return min;
	    }

	    public static void main(String[] args) {
	        int[] inventoryCounts = {50, 12, 89, 5, 34};
	        int smallestCount = getSmallest(inventoryCounts);

	        System.out.println("The smallest value is: " + smallestCount);
	    }
	}

}
