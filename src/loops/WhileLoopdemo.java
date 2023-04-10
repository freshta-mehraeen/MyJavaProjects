package loops;

import java.util.Scanner;

public class WhileLoopdemo {
	
	public static void main(String[] args) {
		System.out.println("Please enter your PIN: "); 
		Scanner scanner = new Scanner(System.in); 
		int PINenteredByUser = scanner.nextInt(); 
		int PINinBankDB = 1234; 
		
		while (PINenteredByUser != PINinBankDB) {
			System.out.println("you entered a wrong PIN. Please try again!"); 
			PINenteredByUser = scanner.nextInt(); 
		}
		
		System.out.println("Welcome to ABC bank"); 
	}

}
