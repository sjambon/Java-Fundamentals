package Labo1;

import java.util.Scanner;

/**
 * Deze klasse print een Error
 * op het scherm
 *
 * @author Steven Jambon
 * @version 24 sept 2018
 */

public class Oefening2 {
    public static void main(String[] args) {
        System.out.println("Aantal");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        scanner.close();
        String sterretjes = "";
        for (int i = 0; i < amount; i++) {
            sterretjes += "*";
            System.out.println(sterretjes);
        }
    }
}