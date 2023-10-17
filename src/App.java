import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Random arpoja = new Random();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Syötä rahaa pelataksesi. Kierros maksaa yhden euron");
		
		String kayttajaSyote = in.nextLine();
		int numero = 0;
		boolean voitto = false;
		int pelaajanRahat = Integer.parseInt(kayttajaSyote);
		int seiskat = 0;
		
		do {
		    pelaajanRahat -= 1;
		
		    for (int i = 0; i < 3; i++) {
			    numero = arpoja.nextInt(1,11);
					System.out.print("|"+numero+"| ");
					if (numero == 7) {
						voitto = true;
						seiskat += 1;
					}
				}
		
			if (seiskat == 3) {
			    pelaajanRahat += 10;
			}
            else if (seiskat == 2) {
				pelaajanRahat += 5;
			}
            else if (seiskat == 1) {
			pelaajanRahat += 2;
			}
			else 	
					
			System.out.println("");
				
			if (voitto != true) {
				System.out.println("Hävisit");
			} else {
				System.out.println("Voitit");
			}
				
			System.out.println("Sinulla on jäljellä: "+pelaajanRahat+" €");
			System.out.println("Haluatko pelata uudestaan? Jos haluat pelata paina Enter.\nJos et halua pelata  kirjoita e ja paina Enter ");
			kayttajaSyote = in.nextLine().toLowerCase();
			if (kayttajaSyote.equals("e")) {
				break;
			} 
            else {
				seiskat = 0;
				continue;
            }
            			
		} while (pelaajanRahat > 0);
		
		if (pelaajanRahat == 0) {
			System.out.println("Rahasi loppuivat.");
		} else 
			System.out.println("Lopetit pelin.");
	}	
		
}
