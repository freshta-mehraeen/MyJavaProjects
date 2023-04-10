package demo;

public class Car {
	
	public static void main(String[] args) {
		//Class Object = new Class();
		Car mercedes = new Car();
		// mercedes is an object of class car 
		Car audi = new Car();
		Car bmw = new Car();  
		
		// properties of mercedes
		int numberOfTyres = 4; 
		
		String colorOfCar = "silver" ; 
		String favoriteColor = "My favorite color is white"; 
		String day = "Todat it is Wednesday"; 
		
		double hightOfCar = 155.5; 
		double temperature = 23.7; 
		float widthOfTyreOfCar = 25.7f; 
		float lengthOfHair = 3.5f; 
		
		boolean didIHaveMyBreakfast = false; 
		boolean didIDrinkWater = true; 
		
		char model = 's'; 
		char answer = 'y'; 
		
		System.out.println("Today is Wednesday");
		System.out.println("Tommorrow is Thursday");
		System.out.println(favoriteColor);
		System.out.println(day); 
		System.out.println("Hight of car =" + hightOfCar + "cms");
		System.out.println("Today the temprature is " + temperature + "degrees F");  
		
		
		
	}

}
