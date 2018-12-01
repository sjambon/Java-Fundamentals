package Labo4;

import java.util.Scanner;

/**
 * Dit programma verwijderd het eerste woorde van de zin die jij ingeeft.
 *
 * @author Steven Jambon
 * @version 15 oct 2018
 */

public class Oefening05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Schrijf een zin: ");
        String zin = scanner.nextLine();
        int space = zin.indexOf(" ") + 1;
        zin = zin.substring(space);
        System.out.println(zin);
    }
}
