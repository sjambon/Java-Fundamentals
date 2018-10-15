package Labo3;

import java.util.Scanner;

/**
 * Dit programma berekend het te betalen bedrag adhv de hoeveelheid personen.
 *
 * @author Steven Jambon
 * @version 8 oct 2018
 */

public class Oefening10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef het aantal personen: ");
        int aantal = scanner.nextInt();
        int rest = aantal % 10;
        int perTien = (aantal - rest) / 10;
        int bedrag = (aantal - perTien) * 10;
        System.out.println("Het bedrag dat ze moeten betalen is: " + bedrag);
    }
}