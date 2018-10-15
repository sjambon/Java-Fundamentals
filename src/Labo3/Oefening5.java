package Labo3;

import java.util.Scanner;

/**
 * Dit programma berekend het volume adhv de straal en de hoogte van een cilinder.
 *
 * @author Steven Jambon
 * @version 8 oct 2018
 */

public class Oefening5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de straal: ");
        double straal = scanner.nextInt();
        System.out.println("Geef de hoogte: ");
        double hoogte = scanner.nextInt();
        double volume = Math.PI * straal * straal * hoogte;
        System.out.println("Het volume van de cirkel is: " + volume);
    }
}