package com.javaadvancedtopics;



public class ReplaceString {

	public static void main(String[] args) {
		
			String str="w238dsl ;   kds2039492873lk...@3u";
			System.out.println(str.replaceAll("[^a-z0-9]", ""));
			//Result: w238dslkds2039492873lk3u (spaces, ; and @ are gone )
			System.out.println(str.replaceAll("[^a-z]", ""));
			//Result: wdslkdslku (numbers, spaces, ; and @ are gone )
			
			String s = "Hello 123 World!";
			System.out.println(s.replaceAll("[^a-zA-Z]", "")); 
			// Result: HelloWorld (Numbers, spaces, and ! are gone)
			
			String data = "Code Order #992-AZ-45";
			String numbersOnly = data.replaceAll("[^0-9]", "");
			System.out.println(numbersOnly); 
			// Result: 99245
			
			/*String data = "Code Order #992.45-AZ";
			 String priceOnly = data.replaceAll("[^0-9.]", ""); 
			 System.out.println(priceOnly); 
			// Result: 992.45
			*/
			
			String original = "Java is fun";
			// This falls under String Manipulation
			String modified = original.replace("fun", "awesome"); 
			System.out.println(modified); 
			//Result: Java is awesome
			
			
			String st = "World is big";
			String st1= st.replaceFirst("World", "Universe");
			System.out.println(st1);
			//Result: Universe is big
			System.out.println(st.replaceFirst("big", "beautiful"));
			
			
			String ss = "123 BIGBANG Theory";
			String ss1 = ss.replace("123", "");
			System.out.println(ss1);
			//Result: BIGBANG Theory (123 replace with "")
			System.out.println(ss.replace("BIGBANG", "cosmos"));
			//Result:123 cosmos Theory
			

			String test = "apple apple apple";
			System.out.println(test.replaceFirst("apple", "orange"));
			//Result:orange apple apple
			System.out.println(test.replace("apple", "orange"));
			//Result:orange orange orange
			
	}

}





