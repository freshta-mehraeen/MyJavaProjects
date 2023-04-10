package demo1;

public class Mobile {
	
	String color; 
	int batteryBackup; 
	double screenSize; 
	
	public Mobile(String mobileColor, int batteryTime, double sizeOfScreen) {
		color = mobileColor; 
		batteryBackup = batteryTime; 
		screenSize = sizeOfScreen; 
	}
	
	public void printMobileProperties() {
		System.out.println("color of Mobile = " + color);
		System.out.println("Battery backup = " + batteryBackup);
		System.out.println("Screen Size = " + screenSize);
	}
	
	public static void main(String[] args) {
		Mobile apple = new Mobile("White" , 15, 6); 
		Mobile samsung = new Mobile("black", 17, 6.5); 
		
		samsung.printMobileProperties(); 
	}

}
