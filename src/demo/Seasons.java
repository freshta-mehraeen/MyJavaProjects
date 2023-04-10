package demo;

public class Seasons {

	public void winters() {
		System.out.println("Winters are cold");

}
	public void summers() {
		System.out.println("summers are hot");
	}
	
	public static void main(String [] args) {
		// class object = new class (); 
		Seasons seasons = new Seasons(); 
		
		//object.method ()
		seasons.winters();
		seasons.summers(); 
	}
}
