package Labo2;

import java.util.Scanner;

/**
 * Dit programma check een rekeningnummer.
 *
 * @author Steven Jambon
 * @version 1 oct 2018
 */

public class Oefening8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter(" ");
        System.out.println("Geef je rekeningnummer met IBAN code: ");
        String iban = scanner.next(); //Niet nodig
        String benr = scanner.next(); //BE-nummer
        String rest = scanner.nextLine();
        System.out.println("De IBAN code is: " + benr);
        System.out.println("Het rekeningnummer:" + rest);
        scanner.close();
    }
}