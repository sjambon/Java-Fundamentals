package Labo3;

import java.util.Scanner;

/**
 * Dit programma berekend de temperatuur in farenheit.
 * @author Steven Jambon
 * @version 8 oct 2018
 */

public class Oefening08 {
    public static void main(String[] args) {
        final String DEGREE  = "\u00b0";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de temperatuur in celsius:");
        double celsius = scanner.nextDouble();
        double farenheit = (9/5)*celsius + 32;
        System.out.println(celsius + DEGREE + "C = " + farenheit + DEGREE + "F");
    }
}