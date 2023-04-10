package demo1;

public class Car {
	
	//Global variables 
	String color; 
	String engineType; 
	
	public Car(String colorOfCar, String typeOfEngine) { 
		color = colorOfCar; 
		engineType = typeOfEngine; 
	}
	
	public void printCarInfo() {
		System.out.println("Color of car = " + color); 
		System.out.println("Type of engine = " + engineType); 
		
		
	}
	
	public static void main(String[] args) {
		//class object = new class (); 
		Car mercedes = new Car("silver", "petrol"); 
		
		Car audi = new Car("black", "diesel"); 
		
		//object.method (); 
		audi.printCarInfo(); 
		
	}

}
