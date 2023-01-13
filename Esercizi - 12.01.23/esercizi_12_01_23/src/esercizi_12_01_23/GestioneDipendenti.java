package esercizi_12_01_23;

public class GestioneDipendenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Dipendente d1 = new Dipendente(1, Livello.OPERAIO, Dipartimento.PRODUZIONE, 5);
		 Dipendente d2 = new Dipendente(2, Livello.OPERAIO, Dipartimento.PRODUZIONE, 5);
		 Dipendente d3 = new Dipendente(3, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE, 5);
		 Dipendente d4 = new Dipendente(4, Livello.DIRIGENTE, Dipartimento.VENDITE, 5);

		d1.promuovi();
		d3.promuovi();

		d1.stampaDipendente();
		d2.stampaDipendente();
		d3.stampaDipendente();
		d4.stampaDipendente();
		
		System.out.printf( "Il MONTE STIPENDI DA PAGARE E': €%.2f", (d1.stipendioTotale(5) + d2.stipendioTotale(5) + d3.stipendioTotale(5) + d4.stipendioTotale(5)) );
		

	}

	

	public void calcolaPaghe() {
		
	}

}
