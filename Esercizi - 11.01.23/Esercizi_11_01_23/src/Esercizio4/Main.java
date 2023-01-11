package Esercizio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		contoRovescia();
		

	}
	
	static void contoRovescia() {
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("inserisci un numero: ");
		int num = scan.nextInt();
		
		for (int i = num; i >= 0; i-- ) {
			System.out.println(i);
		}
		
		System.out.println("Fine del conteggio");
		
	}
	
	

}
