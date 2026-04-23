package javaprograms;

public class ArrayReverse {

	public static void main(String[] args) {
		   //using two for loops
		   int[] original = {1, 2, 3, 4, 5};     
	       int[] reversed = new int[original.length];

		   for (int i = 0; i < original.length; i++) 
		   {
		      reversed[i] = original[original.length - 1 - i];
		     }
		   
		   for (int num : reversed) 
			  {  
			   System.out.print(num + " ");
			  }
		   
		   
		   //using one for loop   
		    int[] original1 = {6, 7, 8, 9, 10};
              
		       for (int i = original1.length - 1; i >= 0; i--) 
		       {
		         System.out.print(original1[i] + " ");
		       }
		  }
	}

