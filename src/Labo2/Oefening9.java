package Labo2;

import java.util.Scanner;

/**
 * Dit programma print de tijd uit.
 *
 * @author Steven Jambon
 * @version 1 oct 2018
 */

public class Oefening9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef je input( uur : minuten : seconden): ");
        String[] tijd = scanner.nextLine().split(":");
        System.out.println("Het ingegeven uur was: " + tijd[0] + " u " + tijd[1] + " min " + tijd[2] + " sec");
    }
}