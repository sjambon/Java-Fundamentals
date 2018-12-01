package Labo3;

import java.util.Scanner;

/**
 * Dit programma berekend de temeperatuur in graden Celsius.
 *
 * @author Steven Jambon
 * @version 8 oct 2018
 */

public class Oefening09 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);
        final String DEGREE = "\u00b0";

        System.out.print("Geef de temperatuur in farenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + DEGREE + "F = " + celsius + DEGREE + "C");
    }
}