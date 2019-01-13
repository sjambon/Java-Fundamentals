package Labo4;

import java.util.Scanner;

/**
 * Dit programma wisselt de eerste twee woorden in een zin.
 *
 * @author Steven Jambon
 * @version 15 oct 2018
 */

public class Oefening07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een zin van minimum 2 woorden: ");
        String zin = scanner.nextLine();
        int eersteSpace = zin.indexOf(" ");
        int tweedeSpace = zin.substring(eersteSpace + 1).indexOf(" ");
        String woord1 = zin.substring(0, eersteSpace);
        String woord2;
        if (tweedeSpace == -1) {
            woord2 = zin.substring(eersteSpace + 1);
            System.out.println(woord2 + " " + woord1 + "?");
        } else {
            woord2 = zin.substring(eersteSpace + 1, eersteSpace + tweedeSpace + 1);
            zin = zin.substring(eersteSpace + tweedeSpace + 1);
            System.out.println(woord2 + " " + woord1 + zin + "?");
        }
    }
}
