package demo;

public class Calculator {
	// below we are defining add () method
	public void add(int a, int b) {
		System.out.println(a+b);
	}
		
		public void subtract(int a, int b) {
			System.out.println(a-b);
		}
		
		public void multiply(int a, int b) {
			System.out.println(a*b);
		}
	
		public void divide(double a, double b) {
			System.out.println(a/b);
		}
	
	public static void main(String[] args) { 
		// class object = new class(); 
		Calculator cal = new Calculator(); 
		
		// object.method ()
		cal.add(10, 20); // here we are calling the add () method 
		
		//object method ()
		cal.add(10, 20);
		cal.add(56, 49);
		cal.subtract(20, 5); 
		cal.add(30, 40);
		cal.divide(100, 3);  
		
	}

}
