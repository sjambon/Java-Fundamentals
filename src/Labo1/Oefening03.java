package Labo1;

import java.util.Scanner;

/**
 * Deze klasse print een Error
 * op het scherm
 *
 * @author Steven Jambon
 * @version 24 sept 2018
 */

public class Oefening03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is jouw naam?");
        String naam = scanner.next();
        System.out.println("In welke klas zit je?");
        String klas = scanner.next();
        System.out.println("Wat is jouw mail adres?");
        String email = scanner.next();
        System.out.println("Wat is de naam van jouw middelbare school?");
        String secundair = scanner.next();
        System.out.println("Welke richting deed je daar?");
        String richting = scanner.next();
        System.out.println("Wat is jouw programmeerervaring?");
        String programmeerErvaring = scanner.next();
        scanner.close();
        System.out.println("----------------------------------------");
        System.out.println("Naam: " + naam);
        System.out.println("Klas: " + klas);
        System.out.println("Email: " + email + "\n");
        System.out.println("SO: " + secundair);
        System.out.println("Richting: " + richting + "\n");
        System.out.println("Programmeerervaring: " + programmeerErvaring);
    }
}