package Labo5;

import java.util.Scanner;

public class Oefening03 {
    public static void main(String[] args) {
        System.out.println("Hoeveel behaalde je op je theorietest?");
        Scanner scanner = new Scanner(System.in);
        double theoriePunt = scanner.nextDouble();
        System.out.println("Hoeveel behaalde je op het practicum?");
        double practicumPunt = scanner.nextDouble();
        if (practicumPunt < theoriePunt) {
            System.out.printf("Je totaal is: %s", practicumPunt);
        } else {
            double eindresultaat = (double) Math.round((practicumPunt + theoriePunt) / 2 * 10) / 10;
            System.out.printf("Je totaal is: %s", eindresultaat);
        }
    }
}
