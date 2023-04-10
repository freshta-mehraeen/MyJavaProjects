package loops;

import java.util.Scanner;

public class VirtualParrot {
	
	public static void main(String[] args) {
		System.out.println("Please type a new word: ");
		
		Scanner scanner = new Scanner(System.in); 
		String word = scanner.nextLine(); 
		
		while (!word.toLowerCase() .equals ("quit") ) { 
			System.out.println(word);
			System.out.println("Please type a new word: ");
			word = scanner.nextLine(); 
		}
	}

}
