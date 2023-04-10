package demo2;

public class Student { 
	int id; 
	String name; 
	
	public Student(int id, String name) {
		this.id = 1;  
		this.name = name;  
	}
	
	public void display() {
		System.out.println(id + " " +name ); 
	}
	
	public static void main(String[] args) {
		//Create an object student 1 whose id is 1 and name is John and then call the display () method
		Student student1 = new Student(1, "John"); 
		student1.display(); 
		
		// Create another object student 2 whose id = 2 and name is Sam and then call the display () method 
		Student student2 = new Student(2, "Sam"); 
		student2.display();  
	}

}
