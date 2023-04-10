package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo { 
	
	public static void main(String[] args) {
		HashMap<String, Integer> td = new HashMap<>(); 
		
		//store the items in the memory 
		td.put("Tim", 12345); 
		td.put("Sam", 23456); 
		td.put("John", 34567); 
		td.put("Bradd", 45678); 
		
		//Retrieve the items 
		for(Map.Entry m: td.entrySet()) {
			System.out.println(m.getKey()+ " - " + m.getValue()); 
		}
	}

}
