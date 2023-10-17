import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		Random arpoja = new Random();
		int numero = 0;
		boolean voitto = false;
		int pelaajanRahat = 1;
		int seiskat = 0;

		for (int i = 0; i < 3; i++) {	
			numero = arpoja.nextInt(1,11);
			System.out.print("|"+numero+"| ");
			if (numero == 7) {
				voitto = true;
				seiskat += 1;
			}
			System.out.println("V "+voitto+" "+seiskat);
		}
		
		if (seiskat == 3) {
			pelaajanRahat += 7;
		}
		else if (seiskat == 2) {
			pelaajanRahat += 5;
		} 
		else if (seiskat == 1) {
			pelaajanRahat += 2;
		}
		else 	
		
		System.out.println("");
		System.out.println(voitto);
		System.out.println("Pelaajan rahat: "+pelaajanRahat);
		if (voitto != true) {
			System.out.println("Hävisit");
		} 
        else
			System.out.println("Voitit");
	}	
		
}
