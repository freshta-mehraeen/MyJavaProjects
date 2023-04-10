package demo2;

public class Helicopter extends Flyingmachine {
	
	public static void hover () {
		System.out.println("Helicopter can hover over ground"); 
	}
	
	public static void main(String[] args) {
		Helicopter helicopter = new Helicopter ();
		
		//object.method (); 
		helicopter.hover (); 
		helicopter.travel (); 
		
		//call hover and and travel methods in this class (); 
		// class.method (); 
		Helicopter.hover (); 
		Flyingmachine.travel (); 
	}

}
