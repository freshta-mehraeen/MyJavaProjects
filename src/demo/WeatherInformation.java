package demo;

public class WeatherInformation {
	public static void main(String[] args) {
		int temperature = 10; 
		if (temperature<-20) {
		System.out.println("Extremely Cold"); 
		
		
	} 
		else if(temperature <0) {
		System.out.println("Cold"); 
		}
	    
	    else if (temperature <15) {
	    	System.out.println("Pleasant"); 	
}
	    else {
	    System.out.println("Hot"); 
	    		
	    	}
	    }
}

