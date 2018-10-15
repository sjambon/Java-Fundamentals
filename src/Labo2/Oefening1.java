package Labo2;

import java.util.Scanner;

/**
 * Dit programma vraagt een karakter, berekent de ASCII-nummer hiervan en
 * print deze op het scherm
 *
 * @author Steven Jambon
 * @version 1 oct 2018
 */

public class Oefening1 {
    public static void main(String[] args) {
        System.out.println("Geef het karakter waarvan je de numerieke waarde wilt weten:");
        Scanner scanner = new Scanner(System.in);
        char karakter = scanner.next().charAt(0); // Het karakter inlezen van System.in
        int value = karakter; // Vormt het karakter om naar een int
        System.out.println("Dit is het karakter: " + karakter);
        System.out.println("De numerieke waarde ervan is: " + value);
    }
}