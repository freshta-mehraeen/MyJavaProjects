package demo2;

import demo.Calculator;
import demo.Printer; 

public class Test2 {
	
	public static void main (String [] args ) {
		// call add () method from Calculator class in this class
		
		// class object = new class();
		Calculator cal = new Calculator ();
		
		//object.method();
		cal.add(20, 70);
		
		// call printName () method from Printer class in this class
		//Class object = new class ();
		Printer printer = new Printer();
		
		// object.method ();
		printer.printName("Fereshta"); 
	}

}
