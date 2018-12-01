package Labo3;

import java.util.Scanner;

/**
 * Dit programma geeft het quotient van twee opgegeven getallen terug.
 *
 * @author Steven Jambon
 * @version 8 oct 2018
 */

public class Oefening03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een getal:");
        double getal1 = scanner.nextDouble();
        System.out.println("Geef een tweede getal: ");
        double getal2 = scanner.nextDouble();
        double tussenstap = getal1 / getal2;
        System.out.println("Geef een derde getal: ");
        double getal3 = scanner.nextDouble();
        double uitkomst = tussenstap/getal3;
        System.out.println("De uitkomst is: " + uitkomst);
    }
}
