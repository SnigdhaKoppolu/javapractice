package com.arrays;

public class ForEachArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		//to print above numbers except last one value
		for(int i=0; i<4; i++)
		{
			System.out.println(arr[i]);
		}

	
		//to print above all numbers
		for(int i=0; i<5; i++)
		{
			System.out.println(arr[i]);
		}
		
		//for each loop
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		float[]f1= {12.5f, 133.0f, 143.7f};
		//enhanced for loop
		for(float f: f1)
			System.out.println(f);
	}

}
