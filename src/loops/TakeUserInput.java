package loops;

import java.util.Scanner;

public class TakeUserInput {
	
	public static void main(String[] args) {
		System.out.println("please enter your age: ");
		
		//class object = new class(); 
		Scanner scanner = new Scanner(System.in); 
		int age = scanner.nextInt(); //object.method ()
		
		
		
		
		System.out.println("you entered your age as - " + age); 
	}

}
