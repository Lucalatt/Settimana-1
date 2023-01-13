import interfacce.Luminosita;

public class Immagine extends elementoMultimediale implements Luminosita{

	
	public Immagine (String titolo) {
		super ( titolo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int aumentaLuminosita() {
		if (luminosità < 10) {
			return luminosità ++;
			} else {
				System.out.println("Volume massimo");
			}
			return luminosità;
	}

	@Override
	public int riduciLuminosita() {
		if (luminosità >= 10) {
			return luminosità --;
			} else {
				System.out.println("Volume minimo");
			}
			return luminosità;
	}
	
	@Override
    public String toString() {
        return "IMMAGINE: " + this.titolo;
    }
	

	
}
