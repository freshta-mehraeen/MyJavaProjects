package Inheritance;

public class C extends F {
	
	public void day(){
		System.out.println("it is Thursday");
		
	}
	public static void main (String [] args ) {
		//class object = new class (); 
		C c = new C (); 
		
		// object.method (); 
		c.day (); //from the child class itself
		c.date();  //from parent class
		c.nextYear (); //from grand parent class
	}

}
