package esercizi_12_01_23;

public class Dipendente {
	
	private  double stipendioBase = 1000.00;
	private  int matricola;
	private  double stipendio;
	double straordinario;
	private Livello jobLevel;
	Dipartimento jobDepartment;
	
	
	
	public Dipendente(int matricola, Dipartimento jobDepartment) {
		this.matricola = matricola;
		this.jobDepartment= jobDepartment;
		this.stipendio = stipendioBase;		
		this.jobLevel = Livello.OPERAIO;
		
	}
	
	public Dipendente(int matricola, Livello jobLevel, Dipartimento jobDepartment, double strordinario ) {
		this (matricola, jobDepartment );
		this.stipendio = stipendioBase;
		this.straordinario = 30;		
		this.jobLevel = jobLevel;
		
		
	}

	public double getStipendioBase() {
		return stipendioBase;
	}

	public void setStipendioBase(double stipendioBase) {
		this.stipendioBase = stipendioBase;
	}

	public int getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double getStraordinario() {
		return straordinario;
	}

	public Livello getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(Livello jobLevel) {
		this.jobLevel = jobLevel;
	}

	public Dipartimento getJobTitle() {
		return jobDepartment;
	}

	public void setJobTitle(Dipartimento jobTitle) {
		this.jobDepartment= jobDepartment;
	}
	
	public void stampaDipendente () {
		
		paga();
		
		System.out.println("-------------------------"); 
		
		System.out.println("DIPENDENTE");
		System.out.println("MATRICOLA: " + matricola);
		System.out.println("STIPENDIO: " + stipendio);
		System.out.println("LIVELLO: " + jobLevel);
		System.out.println("DIPARTIMENTO: " + jobDepartment);
		System.out.println("-------------------------");
		
		
		
	}
	
	
	
	public double promuovi() {
		
		switch (this.jobLevel) {
		
		case OPERAIO:
			
			this.jobLevel = Livello.IMPIEGATO;
			System.out.println("sei stato promosso");
			return this.stipendio = stipendioBase * 1.2;
			
		
		case IMPIEGATO:
			
			this.jobLevel = Livello.QUADRO;
			return this.stipendio = stipendioBase * 1.5;
			
		case QUADRO:
			this.jobLevel = Livello.DIRIGENTE;
			return this.stipendio = stipendioBase * 2;
			
		case DIRIGENTE:
			System.out.println("sei al top");
			
		default:
			return stipendio;
			
			
		}
		
	}
	
public double paga() {
		
		
		
		switch (this.jobLevel) {
		
		case OPERAIO:
			return this.stipendio = stipendioBase;
		
		case IMPIEGATO:
			return this.stipendio = stipendioBase * 1.2;
			
		case QUADRO:
			return this.stipendio = stipendioBase * 1.5;
			
		case DIRIGENTE:
			return this.stipendio = stipendioBase * 2;
			
		default:
			break;
		}
		return matricola;
			
			

		
	}
	
	public void calcolaPaga() {
		System.out.println("STIPENDIO DIPENDENTE: " + matricola);
		System.out.println("LIVELLO: " + jobDepartment);
		System.out.printf("STIPENDIO: €%.2f %n", stipendio);
		System.out.println("-------------------------------");
	}
	
	public void calcolaPaga( int a) {
		
		System.out.println("STIPENDIO DIPENDENTE: " + matricola);
		System.out.println("LIVELLO: " + jobDepartment);
		System.out.printf("STIPENDIO: €%.2f %n", stipendio);
		System.out.println("ORE DI STRAORDINARIO: " + a);
		System.out.println("-------------------------------");
		
	}
	
	public double stipendioTotale( int a ) {
		return (stipendio + (straordinario * a));
	}
	

}
