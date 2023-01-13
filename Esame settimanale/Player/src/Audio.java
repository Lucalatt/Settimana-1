import interfacce.Volume;

public class Audio extends elementoMultimediale implements Volume{
	

	public Audio(int durata, String titolo) {
		super(durata, titolo);
		// TODO Auto-generated constructor stub
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
	
	 public String toString() {
	        return "AUDIO: " + this.titolo + "- DURATA AUDIO: " + this.durata;
	 }
	       
	
}
