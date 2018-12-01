package Labo3;

import java.util.Scanner;

/**
 * Dit programma geeft het product van de opgegeven waardes terug.
 *
 * @author Steven Jambon
 * @version 8 oct 2018
 */

public class Oefening02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een getal:");
        int getal1 = scanner.nextInt();
        System.out.println("Geef een tweede getal: ");
        int getal2 = scanner.nextInt();
        double product = getal1 * getal2;
        System.out.println("Het product van uw opgegeven waardes is: " + product);
    }
}
