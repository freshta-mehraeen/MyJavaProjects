package Inheritance;

public class E extends F {
	
	public void year () {
		System.out.println("it is 2023");
	}
	
	public static void main (String [] args ) {
		E e = new E (); 
		e.year (); 
		e.date (); 
	}
	

}
