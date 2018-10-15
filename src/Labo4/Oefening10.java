package Labo4;

import java.util.Scanner;

/**
 * Dit programma vormt een unieke Odisee-code adhv jouw voornaam en achternaam.
 */

public class Oefening10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef je voornaam en achternaam:");
        String key = "ODISEE";
        String naam = scanner.nextLine();
        int space = naam.indexOf(" ");
        String voornaam = naam.substring(0, space).toUpperCase();
        String achternaam = naam.substring(space+1).toUpperCase();
        int getal1 = (voornaam.charAt(2)+ 5);
        char letter = (char)((getal1>90) ? getal1-26 : getal1);
        key += letter;
        key += achternaam.substring(achternaam.length()-1);
        key += String.valueOf(achternaam.charAt(0) * voornaam.charAt(0));
        System.out.println(key); //Jan Janssens -> ODISEESS5476
    }
}
