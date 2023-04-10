package demo2;

public class Birds {
	public void fly () {
		System.out.println("birds can fly");
	}
	public void sleep () {
		System.out.println("Birds sleep in the night");
	}
	public void eat () {
		System.out.println("Birds eat insects");
	}
	public static void main (String [] args) {
		Birds birds = new Birds ();  
		
		birds.fly (); 
		birds.sleep (); 
		birds.eat ();  
	}
}
