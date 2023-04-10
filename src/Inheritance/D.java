package Inheritance;

public class D extends F {
	
	public void month() {
		System.out.println("it is March ");
		
	}
	public static void main(String [] args ) {
		D d = new D (); 
		
		d.month (); 
		d.date (); 
		
	}

}
