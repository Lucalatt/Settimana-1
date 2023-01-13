import interfacce.Luminosita;
import interfacce.Volume;

public class Video extends elementoMultimediale implements Volume, Luminosita{

	public Video(int durata, String titolo) {
		super(durata, titolo);
		
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
	public int alzaVolume() {
		if (volume < 10) {
		return volume ++;
		} else {
			System.out.println("Volume massimo");
		}
		return volume;
	}
		
	@Override
	public int abbassaVolume() {
		if (volume >= 10) {
			return volume --;
			} else {
				System.out.println("Volume minimo");
			}
			return volume;
	}
	
	@Override
    public String toString() {
        return "VIDEO: " + this.titolo + "- DURATA VIDEO: " + this.durata;
       
        
    }

}
