package assignments;

public class Vegetable { 
	
	String color; 
	String shape; 
	
	public Vegetable(String color, String shape) {  
		this.color = color; 
		this.shape = shape; 
		
	}
	
	public void printVegetableInfo() {
		System.out.println("Color = " + color); 
		
		System.out.println("Shape = " + shape); 
	}
	
	public static void main(String[] args) {
		Vegetable onion = new Vegetable("pink", "round");  
		Vegetable potato = new Vegetable("brown", "elliptical"); 
		
		potato.printVegetableInfo();  
		
	}

}
