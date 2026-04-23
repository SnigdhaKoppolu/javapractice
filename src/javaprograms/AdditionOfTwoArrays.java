package javaprograms;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {
		        
		        int[] arr1 = {10, 20, 30, 40, 50};
		        int[] arr2 = {1, 2, 3, 4, 5};

		        int[] result = new int[arr1.length];

		        for (int i = 0; i < arr1.length; i++) {
		            result[i] = arr1[i] + arr2[i];
		        }

		      
		        System.out.println("Resulting New Array:");
		        for (int num : result) {
		            System.out.print(num + " ");
		        }
		       
		    }
		}


