package Labo2;

import java.util.Scanner;

/**
 * Dit programma permuteerd enkele waarden.
 *
 * @author Steven Jambon
 * @version 1 oct 2018
 */

public class Oefening6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef 3 double getallen: ");
        double getal1 = scanner.nextDouble();
        double getal2 = scanner.nextDouble();
        double getal3 = scanner.nextDouble();
        double extraGetal = getal1;

        System.out.println("Variable a is: " + getal1);
        System.out.println("Variable b is: " + getal2);
        System.out.println("Variable c is: " + getal3);
        System.out.println("Na de permutatie:");

        getal1 = getal2;
        getal2 = getal3;
        getal3 = extraGetal;

        System.out.println("Variable a is: " + getal1);
        System.out.println("Variable b is: " + getal2);
        System.out.println("Variable c is: " + getal3);
    }
}