package Labo4;

import java.util.Scanner;

/**
 * Dit programma verwijderd het tweede woord van de zin die je ingeeft.
 *
 * @author Steven Jambon
 * @version 15 oct 2018
 */

public class Oefening06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een zin: ");
        String zin = scanner.nextLine();
        int eersteSpace = zin.indexOf(" ");
        int tweedeSpace = zin.substring(eersteSpace + 1).indexOf(" ");
        zin = zin.substring(0, eersteSpace) + zin.substring(tweedeSpace + eersteSpace + 1);
        System.out.println(zin);
    }
}
