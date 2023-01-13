
abstract public class elementoMultimediale {

	String titolo;
	int durata;
	int volume = 5;
	int luminosità = 5;

	public elementoMultimediale(int durata, String titolo) {
		this.durata = durata;
		this.titolo = titolo;
	}
	
	public elementoMultimediale(String titolo) {
		
		this.titolo = titolo;
	}

	public void play() {
		System.out.println("RIPRODUZIONE IN CORSO...");
		if (elementoMultimediale.this instanceof Audio) {
			for (int i = this.durata; i > 0; i--) {
				String volumeConv = "";
	            for(int v = this.volume; v > 0; v--) {
	                volumeConv += " !";
	            }
				System.out.println("TITOLO: " + this.titolo + volumeConv);
				System.out.println("DURATA: " + i);
				
			}
			System.out.println("RIPRODUZIONE TERMINATA");
			System.out.println("-----------------------");
		} else if (elementoMultimediale.this instanceof Video) {
			for (int i = this.durata; i > 0; i--) {
				String luminositaConv = "";
				String volumeConv = "";
	            for(int v = this.volume; v > 0; v--) {
	                volumeConv += " !";
	            }
	            for(int l = this.luminosità; l > 0; l--) {
	            	luminositaConv += " *";
	            }
				System.out.println("TITOLO: " + this.titolo + volumeConv + luminositaConv);
				System.out.println("DURATA: " + i);
			}
			System.out.println("RIPRODUZIONE TERMINATA");
			System.out.println("-----------------------");
		} else {
			mostra();
		}
	}

	public void mostra() {
		String luminositaConv = "";
        for(int l = this.luminosità; l > 0; l--) {
            luminositaConv += " *";
        }
		System.out.println("MOSTRO IMMAGINE");
		System.out.println("TITOLO " + this.titolo + luminositaConv);
		System.out.println("-----------------------");
	}
	
}
