package collections;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		//class           object = new class
		ArrayList<String> cities = new ArrayList <>(); 
		
		//store elements inside the arraylist
		cities.add("London"); 
		cities.add("Paris"); 
		cities.add("Tokyo"); 
		cities.add("New York"); 
		cities.add("LA"); 
		cities.add("Birmingham"); 
		//retrieve the items stored in ArrayList using for-each loop
		for (String t: cities) {
			System.out.println(t); 
		}
		//how many items are stored in the arraylist?
		System.out.println("Total items stored in the arraylist = " + cities.size());
		
		//Which items is stored at index 1
		System.out.println("Item stored at index 1 = " + cities.get(1)); 
		
		//What is the index of Paris?
		System.out.println("Index of Paris = " + cities.indexOf("Paris")); 
		
		//does Berlin exist in the list?
		System.out.println("Does Berlin exist in the list? " + cities.contains("Berlin")); 
		
	}

}
