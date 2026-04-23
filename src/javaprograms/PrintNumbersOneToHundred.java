package javaprograms;

public class PrintNumbersOneToHundred {

	public static void printNumbers()
	{  
		for( int j=1 ; j<=100; j++) {
			System.out.println(j);
		}
	}
	public static void main(String[] args) {
		//print numbers from one to hundred without using numbers
		char ch = 'a';
		String s = "..........";
		System.out.println(ch/ch);
        System.out.println(s.length());
        for(int i=ch/ch; i<=s.length()*s.length(); i++)
        {
        	System.out.println(i);
        
        }
        
        //we can call static method directly without object creation
        printNumbers();
	}

}
