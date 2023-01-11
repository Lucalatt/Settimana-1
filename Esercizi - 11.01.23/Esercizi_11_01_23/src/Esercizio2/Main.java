package Esercizio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		check();

	}

	static void check() {
		Scanner scan = new Scanner(System.in);
		System.out.println("inserisci un numero: ");
		int num = scan.nextInt();

		switch (num) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("due");
			break;
		case 3:
			System.out.println("tre");
			break;
		default:
			System.out.println("Error");

		}

	}

}
