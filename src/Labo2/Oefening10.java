package Labo2;

import java.util.Scanner;

/**
 * Dit programma maakt gebruik van enkele ASCII waarden.
 *
 * @author Steven Jambon
 * @version 1 oct 2018
 */

public class Oefening10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat was de gemiddelde temperatuur de afgelopen 24uur? (in graden Celcius)");
        double temperatuur = scanner.nextDouble();
        System.out.println("Wat was de maximum temperatuur de afgelopen 24 uur? (in graden Celcius)");
        double maxTemp = scanner.nextDouble();
        System.out.println("Wat was de maximum temperatuur de afgelopen 24 uur? (in graden Celcius)");
        double minTemp = scanner.nextDouble();
        System.out.println("Wat is de relatieve zonneschijnduur van vandaag? (in procent)");
        int percentage = scanner.nextInt();
        System.out.println("Hoeveel neerslag is er gevallen vandaag? (in mm)");
        double neerslag = scanner.nextDouble();
        System.out.println("Vanuit welke windrichting komt de wind?");
        char windrichting = scanner.next().charAt(0);
        scanner.close();

        System.out.println("De gemiddelde temperatuur bedroeg: " + temperatuur + '\u00b0' + "C");
        System.out.println("De hoogst gemeten waarde was: " + maxTemp + '\u00b0' + "C");
        System.out.println("De laagst gemeten waarde: " + minTemp + '\u00b0' + "C");
        System.out.println("Het percentage zonneschijnduur was: " + percentage + "%");
        System.out.println("De neerslag bedroeg " + neerslag + "mm");
        System.out.println("De windrichting was: " + windrichting);
    }
}