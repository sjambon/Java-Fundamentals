package Labo4;

import java.util.Scanner;

/**
 * Dit programma controleert of het aan elkaar hechten van de cijfers in je nummerplaat deelbaar is door 4.
 *
 * @author Steven Jambon
 * @version 15 oct 2018
 */

public class Oefening8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef je nummerplaat : ");
        String nummerplaat = scanner.next();
        char getal1 = nummerplaat.charAt(0);
        String getal2 = nummerplaat.substring(6);
        getal2 = getal1 + getal2;
        int getal = Integer.parseInt(getal2);
        System.out.println("Het getal " + getal2 + " is " + (getal % 4 == 0 ? "" : "niet ") + "deelbaar door 4.");
    }
}
