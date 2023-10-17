import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Random arpoja = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("Syötä rahaa pelataksesi. Kierros maksaa yhden euron");
		
		String kayttajaSyote = "";
		while(true) {
		
		kayttajaSyote = in.nextLine();
		
		try {
			int testi = Integer.parseInt(kayttajaSyote) -1 ;
			break;
		} catch (Exception e) {
			System.out.println("Syötä vain numeroita");
			continue;
		}
		}
		
		int pelaajanRahat = Integer.parseInt(kayttajaSyote);
		int numero = 0;
		int seiskat = 0;	
		boolean voitto = false;	
	
		while (pelaajanRahat > 0){
		
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
				System.out.println("Hävisit!");
			}
			else {
				System.out.println("Voitit! ");
			}
				
			System.out.println("Sinulla on jäljellä: "+pelaajanRahat+" euroa");
			if (pelaajanRahat == 0) {
				break;
			}
			System.out.println("Haluatko pelata uudestaan? Jos haluat pelata paina Enter.\nJos et halua pelata  kirjoita e ja paina Enter ");
			kayttajaSyote = in.nextLine().toLowerCase();
			if (kayttajaSyote.equals("e")) {
				break;
			}
			else
				voitto = false;
				seiskat = 0;
					
		}
		
		if (pelaajanRahat == 0) {
			System.out.println("Rahasi loppuivat.");
		} 
		else {
			System.out.println("Lopetit pelin.");
		}
	}	
		
}
