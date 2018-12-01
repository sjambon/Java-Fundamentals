package Labo4;

import java.util.Scanner;

/**
 * Dit programma verandert de eerste letter van je voornaam in een hoofdletter
 *
 * @author Steven Jambon
 * @version 15 oct 2018
 */

public class Oefening04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef je voornaam in kleine letters: ");
        String naam = scanner.next();
        char eersteL = naam.charAt(0);
        eersteL = Character.toUpperCase(eersteL);
        naam = naam.substring(1);
        naam = eersteL + naam;
        System.out.println(naam);
    }
}
