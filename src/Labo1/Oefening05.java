package Labo1;

import java.util.Scanner;

/**
 * Deze klasse print een Error
 * op het scherm
 *
 * @author Steven Jambon
 * @version 24 sept 2018
 */

public class Oefening05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double zwaartekrachtMaan = 1.622;
        final double zwaartekrachtAarde = 9.81;
        System.out.println("Wat is jouw gewicht?");
        double gewichtOpAarde = scanner.nextDouble();
        double massa = gewichtOpAarde / zwaartekrachtAarde;
        double gewichtOpMaan = massa * zwaartekrachtMaan;
        System.out.println("Je gewicht op de maan bedraagt " + gewichtOpMaan + "kg");
    }
}