package demo2;

public class Aeroplane extends Flyingmachine { 
	
	public void fly () {
		System.out.println("Aeroplanes flies at 800 mph!");
	}
	
	public static void main(String[] args) { 
		Aeroplane aeroplane = new Aeroplane (); 
		
		aeroplane.fly (); 
		aeroplane.travel (); 
		
	}
	
	

}
