package Overriding;

public class A extends B { 
	
	public void day() { 
		System.out.println("Today is Tuesday");
		super.day (); 
	}
	
	public static void main(String[] args) {
		A a = new A ();
		a.day(); 
	}

}
