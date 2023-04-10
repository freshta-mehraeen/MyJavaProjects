package loops;

import java.util.Scanner;

public class VirtualParrot1 {
	
	public static void main(String[] args) {
		System.out.println("type something on the console"); 
		
		Scanner scanner = new Scanner(System.in); 
		String word = scanner.nextLine(); 
		
		while (!word.toLowerCase().equals("quit")) {
			System.out.println(word);
			System.out.println("type something on the console: "); 
			word = scanner.nextLine(); 
		}
	}

}
