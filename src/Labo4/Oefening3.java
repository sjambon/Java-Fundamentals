package Labo4;

import java.util.Scanner;

/**
 * Dit programma berekend je BMI adhv jouw lengte en gewicht.
 * @author Steven Jambon
 * @version 15 oct 2018
 */

public class Oefening3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef jouw lengte: ");
        double lengte = scanner.nextDouble();
        System.out.println("Geef jouw gewicht in kg: ");
        double gewicht = scanner.nextDouble();
        double bmi = Math.round(gewicht/(lengte*lengte));
        System.out.printf("Jouw BMI is: %s%n", bmi);
    }
}
