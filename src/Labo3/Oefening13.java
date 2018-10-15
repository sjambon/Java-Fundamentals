package Labo3;

import java.util.Scanner;

/**
 * Dit programma geeft de datum terug in DD:MM:JJ.
 *
 * @author Steven Jambon
 * @version 8 oct 2018
 */

public class Oefening13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de dag in:");
        int dag = scanner.nextInt();
        System.out.println("Geef de maand in:");
        int maand = scanner.nextInt();
        System.out.println("Geef het jaar in:");
        int jaar = scanner.nextInt();
        System.out.println((dag < 10 ? "0" + dag : dag) + "-" + (maand < 10 ? "0" + maand : maand) + "-" + jaar);
        scanner.close();
    }
}
