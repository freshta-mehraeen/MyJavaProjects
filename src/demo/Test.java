package demo;

public class Test { 
	public static void main(String[] args) {
		//call the add() method from Calculator class in this class 
		// class object = new class ()
		Calculator cal = new Calculator();
		
		//object.method();
		cal.add(20, 5);
		cal.subtract (50, 10);
		cal.multiply(5, 6);
		
	}

}
