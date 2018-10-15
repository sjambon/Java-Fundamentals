package Labo2;

import java.util.Scanner;

/**
 * Dit programma berekend een aantal waarden door jou opgegeven.
 *
 * @author Steven Jambon
 * @version 1 oct 2018
 */

public class Oefening5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef het eerste getal: ");
        int getal1 = scanner.nextInt();
        System.out.println("Geef het tweede getal: ");
        int getal2 = scanner.nextInt();
        System.out.println("Geef het derde getal: ");
        int getal3 = scanner.nextInt();
        System.out.println("Geef het vierde getal: ");
        int getal4 = scanner.nextInt();
        int aantal = 4;

        int totaal = (getal1 + getal2 + getal3 + getal4);
        int gemiddelde1 = totaal / aantal; // Gehele gemiddelde
        double gemiddelde2 = totaal / aantal; // Reeel gemiddelde
        int rest = totaal % aantal;

        System.out.println("De waarden van je variabelen zijn: " + getal1 + ", " + getal2 + ", " + getal3 + " en " + getal4);
        System.out.println("Het gehele gemiddelde is: " + gemiddelde1);
        System.out.println("De gehele rest is: " + rest);
        System.out.println("Het gemiddelde is: " + gemiddelde2);
    }
}