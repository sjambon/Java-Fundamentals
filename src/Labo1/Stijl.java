package Labo1;

import java.util.Scanner;

/**
 * Deze klasse print een Error
 * op het scherm
 *
 * @author Steven Jambon
 * @version 24 sept 2018
 */


public class Stijl {
    public static void main(String[] args) {
        final double VALVERSNELLING = 9.81; // symbolische constante
        Scanner scanner = new Scanner(System.in);
        System.out.println("Van welke hoogte wil je de valsnelheid weten?");
        double hoogte = scanner.nextInt(); // een hoogte
        double tijd = Math.sqrt((2 * hoogte) / VALVERSNELLING); // bereken de valtijd en druk het resultaat af
        System.out.println("De valtijd bedraagt " + tijd);
    }
}