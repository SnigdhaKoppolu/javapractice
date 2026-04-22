package com.arrays;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		//int arr[]= {1,5,3,8};
		int arr1[][]= {  
				{1,4,5}, 
				{2,7,8} 
				};
		
		int arr2[][]= {
				{1,5,3},
				{2,8,9}
				};
		
		int arr3[][]= new int [2][3];
		
				for(int i=0; i<2; i++) {
					for(int j=0; j<3; j++) {
						arr3[i][j]=arr2[i][j]+arr1[i][j];
					}	
				}
				
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print( arr3[i][j] + "");	
			}
			System.out.println();
		}
	}
}
