package Labo4;

import java.util.Scanner;

/**
 * Dit programma geeft de minimumwaarde van twee getallen terug.
 *
 * @author Steven Jambon
 * @version 15 oct 2018
 */

public class Oefening01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een geheel getal:");
        int getal1 = scanner.nextInt();
        System.out.println("Geef een tweede geheel getal: ");
        int getal2 = scanner.nextInt();
        int minumum = Math.min(getal1, getal2);
        System.out.printf("Het minimum van opgegeven waarden is: %d%n", minumum);
    }
}
