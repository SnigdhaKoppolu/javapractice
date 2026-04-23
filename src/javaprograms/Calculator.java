package javaprograms;

public class Calculator {
	
	int add(int a, int b) {
		return a+b;
	}
	
	double add(double a, double b) {
		return a+b;
	}
	
	void add(String s1, String s2) {
		System.out.println(s1+s2);
	 }
	public class AdvancedCal{
		  
	 }
	
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		//System.out.println(cal.add(22, 33));
		//System.out.println(cal.add(10.5, 20.5));
		int result1 = cal.add(12, 22);
		double result2 = cal.add(10.5, 20.5);
		System.out.println(result1);
		System.out.println(result2);
		cal.add("hello " , "world");
		}
	}

