package Labo4;

import java.util.Scanner;

/**
 * Dit programma controlleert of het opgegeven rekeningnr correct is.
 *
 * @author Steven Jambon
 * @version 15 oct 2018
 */

public class Oefening9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef je rekeningnummer:");
        String rekeningnr = scanner.nextLine();
        int eerste10 = Integer.parseInt(rekeningnr.substring(8, rekeningnr.length() - 2));
        int controlenr = Integer.parseInt(rekeningnr.substring(rekeningnr.length() - 2));
        System.out.println(((eerste10 % 97 == controlenr) ? "Correct" : "Niet correct"));
    }
}
