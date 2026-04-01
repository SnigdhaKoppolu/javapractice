package com.decisionmakingstatements;

import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
	  try(Scanner sc = new Scanner(System.in)){
		  
	  System.out.println("enter fruit name");
	  String fruit = sc.nextLine();
	  switch(fruit.toLowerCase()){
	  case "apple":
		  System.out.println("price: 2$");
		  break;
		  
	  case "banana":
		  System.out.println("price: 1$");
		  break;
		  
	  case "orange":
		  System.out.println("price: 1.5$");
		  break;
		  
	  case "mango":
		  System.out.println("price: 2.5$");
		  break;
		  
	  case "grapes":
		  System.out.println("price: 1.5$");
		  break;
		  default :
			  System.out.println(fruit+ " not in stock");	  
			  } 
	  }  
  }
}
