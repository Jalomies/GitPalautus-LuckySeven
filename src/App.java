import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		Random arpoja = new Random();
		int numero = 0;
		boolean voitto = false;
		
		for (int i = 0; i < 3; i++) {
			
			numero = arpoja.nextInt(1,11);
			System.out.print("|"+numero+"| ");
			if (numero == 7) {
			    voitto = true;
				System.out.println("V "+voitto);
            }
		}
		System.out.println("");
		System.out.println(voitto);
		if (voitto != true) {
			System.out.println("Hävisit");
		} else
			System.out.println("Voitit");
	}	
		
}
