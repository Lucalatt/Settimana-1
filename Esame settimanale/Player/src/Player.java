import java.util.Scanner;
import java.util.Arrays;

public class Player {

	private static elementoMultimediale[] array = new elementoMultimediale[5];
	private static int counter = 0;

	public static void main(String[] args) {

		mediaPlayer();

	}

	public static void mediaPlayer() {

		System.out.println("WINDOWS MEDIA PLAYER");

		Scanner in = new Scanner(System.in);
		System.out.println("1 - RIPRODUCI");
		System.out.println("2 - AGGIUNGI");
		System.out.println("DOVE VUOI ANDARE?");
		int select = in.nextInt();
		if (select == 2) {
			System.out.println("1 - AUDIO");
			System.out.println("2 - IMMAGINE");
			System.out.println("3 - VIDEO");
			System.out.println("INSERISCI IL TIPO: ");
			int tipo = in.nextInt();

			if (tipo == 1) {
				Scanner in1 = new Scanner(System.in);
				System.out.println("INSERISCI IL TIOLO: ");
				String titolo = in1.nextLine();
				System.out.println("INSERISCI DURATA: ");
				int durata = in1.nextInt();
				System.out.println(titolo + " " + durata);
				Audio a = new Audio(durata, titolo);
				array[counter] = a;
				counter++;
				mediaPlayer();
			} else if (tipo == 2) {
				Scanner in2 = new Scanner(System.in);
				System.out.println("INSERISCI IL TIOLO: ");
				String titolo = in2.nextLine();
				System.out.println(titolo);
				Immagine i = new Immagine(titolo);
				array[counter] = i;
				counter++;
				mediaPlayer();
			} else if (tipo == 3) {
				Scanner in3 = new Scanner(System.in);
				System.out.println("INSERISCI IL TIOLO: ");
				String titolo = in3.nextLine();
				System.out.println("INSERISCI DURATA: ");
				int durata = in3.nextInt();
				System.out.println(titolo + " " + durata);
				Video v = new Video(durata, titolo);
				array[counter] = v;
				counter++;
				mediaPlayer();
			} else {
				System.out.println("VALORE ERRATO");
				mediaPlayer();
			}
		} else if (select == 1) {
			Scanner scan3 = new Scanner(System.in);
			int x = 0;
			for (int i = 0; i < counter; i++) {
				x++;
				System.out.println(x + " " + array[i]);
			}

			System.out.println("SCEGLI UN MEDIA:");
			int scegliMedia = scan3.nextInt();
			switch (scegliMedia) {
			case (0):
				mediaPlayer();
				break;
			case (1):
				controllo(array[0]);
				break;
			case (2):
				controllo(array[1]);
				break;
			case (3):
				controllo(array[2]);
				break;
			case (4):
				controllo(array[3]);
				break;
			case (5):
				controllo(array[4]);
				break;
			}

		} else {
			System.out.println("VALORE ERRATO");
			mediaPlayer();
		}
	}

	public static void controllo(elementoMultimediale array) {
		if(array instanceof Audio) {
			Scanner in = new Scanner(System.in);
			System.out.println("1 - RIPRODUCI");
			System.out.println("2 - AUMENTA VOLUME");
			System.out.println("3 - RIDUCI VOLUME");		
			System.out.println("SELEZIONE: ");
			int select = in.nextInt();
			if(select == 1) {
				((Audio) array).play();
			} else if (select == 2) {
				((Audio) array).alzaVolume();
				System.out.println("VOLUME !");
				controllo(array);	
			}  else if (select == 3) {
				((Audio) array).alzaVolume();
				System.out.println("VULUME DIMINUITO!");
				controllo(array);
			} else {
				controllo(array);
			}
			
		} else if (array instanceof Video) {
			Scanner in = new Scanner(System.in);
			System.out.println("1 - Riproduci");
			System.out.println("2 - Aumenta Volume");
			System.out.println("3 - Riduci Voume");
			System.out.println("4 - Aumenta Luminosità");
			System.out.println("5 - Riduci Luminosità");
			System.out.println("Selezione: ");
			int select = in.nextInt();
			if(select == 1) {
				((Video) array).play();
			} else if (select == 2) {
				((Video) array).alzaVolume();
				System.out.println("Volume aumentato!");
				controllo(array);
			} else if (select == 3) {
				((Video) array).abbassaVolume();
				System.out.println("Volume diminuito!");
				controllo(array);
			} else if (select == 4) {
				((Video) array).aumentaLuminosita();
				System.out.println("Luminosità aumentato!");
				controllo(array);
			} else if (select == 5) {
				((Video) array).riduciLuminosita();
				System.out.println("Luminosità diminuita!");
				controllo(array);

			} else {
				controllo(array);
			}
			
		} else if (array instanceof Immagine) {
			Scanner in = new Scanner(System.in);
			System.out.println("1 - Riproduci");
			System.out.println("2 - Aumenta Luminosita'");
			System.out.println("Selezione: ");
			int select = in.nextInt();
			if(select == 1) {
				((Immagine) array).play();
			} else if (select == 2) {
				((Immagine) array).aumentaLuminosita();
				System.out.println("Luminosita' aumentata!");
				controllo(array);
			} else if (select == 3) {
				((Immagine) array).riduciLuminosita();
				System.out.println("Luminosità diminuita!");
				controllo(array);
			} else {
				controllo(array);
			}
		}
		
	}
	
	
}



