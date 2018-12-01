package Labo3;

import java.util.Scanner;

/**
 * Dit programma berekend adhv een opgegeven straal de omtrek en oppervlakte van een cirkel.
 *
 * @author Steven Jambon
 * @version 8 oct 2018
 */

public class Oefening04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de straal: ");
        double straal = scanner.nextInt();
        double omtrek = 2 * Math.PI * straal;
        System.out.println(omtrek);
        double oppervlakte = Math.round(straal * straal * Math.PI);
        System.out.println(oppervlakte);
    }
}