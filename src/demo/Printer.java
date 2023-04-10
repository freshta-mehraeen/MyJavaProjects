package demo;

public class Printer {
	
	
public void printName(String name) {
	System.out.println("my name is" + name);
}

public static void main (String []args ) {
	//class object = new class();
	Printer printer = new Printer();
	
	//object.method()
	printer.printName("Tom"); 
	printer.printName ("Sam"); 
}
}