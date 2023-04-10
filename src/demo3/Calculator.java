package demo3;

public class Calculator {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(double a, double b) {
		System.out.println(a+b); 
	}
	
	public void add(int a, int b, int c) { //add ()method is overload here
		System.out.println(a+b+c);
		
	}
	
	public void add(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
	
	public static void main(String [] args) {
		//class object = new class ();
		Calculator calculator = new Calculator();
		
		//object.method()
		calculator.add (10, 20); 
		calculator.add(3.2, 4.5); 
		calculator.add(10, 20, 30);
		calculator.add(10, 20, 30, 40);
		
	}

}
