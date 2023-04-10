package collections;
	
	import java.util.HashSet;  


	public class HashSetDemo {
		
		public static void main(String[] args) {
			
			//class           object = new class
			HashSet<String> cities = new HashSet <>();  
			
			//store elements inside the Hashsetdemo
			cities.add("London"); 
			cities.add("Paris"); 
			cities.add("Tokyo"); 
			cities.add("New York"); 
			cities.add("LA"); 
			cities.add("Birmingham"); 
			//retrieve the items stored in HashSet using for-each loop
			for (String t: cities) {
				System.out.println(t); 
			}
			//how many items are stored in the HashSetDemo
			System.out.println("Total items stored in the HashSet = " + cities.size());
			
			//Which items is stored at index 1
			//System.out.println("Item stored at index 1 = " + cities.get(1)); 
			
			//What is the index of Paris?
			//System.out.println("Index of Paris = " + cities.indexOf("Paris")); 
			
			//does Berlin exist in the list?
			System.out.println("Does Berlin exist in the list? " + cities.contains("Berlin")); 
			
		}

	}



