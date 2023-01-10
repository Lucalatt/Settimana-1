
public class Rettangolo {
	
	double b;
	double h;
	
	public Rettangolo(double h, double b) {
		this.b = b;
		this.h = h;
	}
	
	public double calcArea() {
		return (this.b * this.h);
	}
	
	public double calcPerim() {
		return ( 2*(this.b + this.h));
	}
	
	public void stampaRettangolo() {
		System.out.println("L'area del rettangolo è: " + this.calcArea());
	    System.out.println("Il perimetro del rettangolo è: " + this.calcPerim());
	}
	
	public void stampaDueRettangoli(Rettangolo r2) {
		System.out.println("L'area dei due rettangoli è: " + (this.calcArea() + r2.calcArea()));
		System.out.println("Il perimetro dei due rettangoli è: " + (this.calcPerim() + r2.calcPerim()));
	}
	
	
	//public double dueRettangoli

}
