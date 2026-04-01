package com.decisionmakingstatements;

import java.util.Scanner;

public class SwitchBrowser {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		System.out.println("enter browser name");
		String browser = sc.nextLine();
		
		switch(browser.toLowerCase()) {
		case "chrome":
			System.out.println("launching Chrome browser");
			break;
			
		case "firefox":
			System.out.println("launching firefox browser");
			break;
			
		case "internet explorer":
			System.out.println("launching internet explorer");
			break;
			
		default :
				System.out.println("browser is not supporting: " +browser);
				}
		}
	}
}
