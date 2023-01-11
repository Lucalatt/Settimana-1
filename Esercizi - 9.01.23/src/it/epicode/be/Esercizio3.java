package it.epicode.be;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] ins = new String[3];
		
		for(int i = 0; i < ins.length; i++) {
			System.out.println("Inserire un numero: ");
			ins[i] = scan.next();
		}
		
		System.out.println(java.util.Arrays.toString(ins));
		
		for(int i = ins.length-1; i >= 0; i--) {
			System.out.print(ins[i] + ",");
			
		}

	}

}
