package it.epicode.be;

public class Esercizio4 {

	public static void main(String[] args) {
		
		perim(3.3, 5.2);
		area(2.8, 6.9);
		
		// TODO Auto-generated method stub

	}
	
	static void perim(double a, double b) {
		double ris = (a * b)*2;
		System.out.println("Il perimetro è " + ris);
	}

	static void area(double a, double b) {
		double area = ( a*b )/2;
		System.out.println("l'area del triangolo è: " + area);
	}
}
