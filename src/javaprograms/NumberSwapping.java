package javaprograms;

public class NumberSwapping {
	
    //Number swapping using 3rd variable
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
        System.out.println("value of c "+c);
        
	
     //Number swapping without 3rd variable
	int x=22;
	int y=33;
	x=x+y;
	y=x-y;
	x=x-y;
	
	System.out.println("value of x "+x);
	System.out.println("value of y "+y);
	}
}
