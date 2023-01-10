package it.epicode.be;

public class Esercizio2 {
	
	public static void main(String[] args) {
		
		System.out.println(mult(10,10));
		System.out.println(conc("esercizi di oggi", 8));
		
	}
	
	static int mult (int a, int b) {
		return a * b;
	}
	
	static String conc (String str, int x) {
		return ("Gli " + str + " sono " + x); 
	}
	
	

}
