import java.util.Random;
import java.util.Scanner;

public class lucky7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Tervetuloa Rahapeliin!");
        
        // Kysytään rahamäärä jolla haluaa pelata
        System.out.print("Syötä pelirahasi (euroina): ");
        int pelirahat = scanner.nextInt();
        scanner.nextLine(); // Puhdistaa rivinvaihdon
        
        // Pelaajan peliraha
        int alkuperainenRahat = pelirahat;

        while (pelirahat > 0) 
        {	// while start
            System.out.println("Sinulla on " + pelirahat + " euroa pelirahaa.");

            // Vaihe 1: Arpoo 3 numeroa
            int numero1 = random.nextInt(10) + 1;
            int numero2 = random.nextInt(10) + 1;
            int numero3 = random.nextInt(10) + 1;

            System.out.println("Arvotut numerot: " + numero1 + " " + numero2 + " " + numero3);

            // Vaihe 2: Tarkistaa, onko joku numeroista seitsemän
            if (numero1 == 7 || numero2 == 7 || numero3 == 7) 
            {
                int voitto = 0;

                // Lasketaan voitto riippuen siitä, kuinka monta seiskaa
                if (numero1 == 7) voitto++;
                if (numero2 == 7) voitto++;
                if (numero3 == 7) voitto++;

                // Lasketaan voittojen määrä ja päivitetään pelirahat
                if (voitto == 1) {
                    System.out.println("Voitit 3 euroa!");
                    pelirahat += 3;
                } else if (voitto == 2) {
                    System.out.println("Voitit 5 euroa!");
                    pelirahat += 5;
                } else if (voitto == 3) {
                    System.out.println("Voitit 10 euroa!");
                    pelirahat += 10;
                }
            } 
            	else 
            	{
                System.out.println("Hävisit.");
                pelirahat--;
            	}

            // Vaihe 3: Kysy pelaajalta, haluaako hän pelata uudestaan
            System.out.print("Haluatko pelata uudestaan? (Paina Enter, kirjoita 'e' ja paina Enter lopettaaksesi): ");
            String vastaus = scanner.nextLine();

            if (vastaus.equalsIgnoreCase("e")) 
            	{
                break; // Peli loppuu
            	}
        }	// while end

        System.out.println("Peli päättyi. Alkuperäinen pelirahasi oli " + alkuperainenRahat + " euroa ja loppusaldo on " + pelirahat + " euroa.");

    }
}