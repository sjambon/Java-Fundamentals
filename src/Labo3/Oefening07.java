package Labo3;

import java.util.Scanner;

/**
 * Dit programma berekend de winst op een bedrag.
 *
 * @author Steven Jambon
 * @version 8 oct 2018
 */

public class Oefening07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef het startbedrag : ");
        double bedrag = scanner.nextDouble();
        System.out.println("Geef het winstpercentage: ");
        int percentage = scanner.nextInt();
        double eindbedrag = bedrag * (percentage / 100);
        System.out.println(eindbedrag);
    }
}
