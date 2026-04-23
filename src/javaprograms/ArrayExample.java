package javaprograms;

public class ArrayExample {

	public static void main(String[] args) {
	
				int arr[] = {1,5,2,4,77,9};
				int t ;
				
			    for(int i = 0; i<arr.length; i++)
			    {
			    	for(int j =i+1; j<arr.length; j++) {
			    		if(arr[i]>arr[j]) {
			    			t=arr[i];
			    			arr[i]= arr[j];
			    	        arr[i]=t;
			    	        }
			    	}
			    	}
		       for(int i=0; i<arr.length; i++)
		         {
			       System.out.println(arr[i]);
		          }
			}
			
		}



