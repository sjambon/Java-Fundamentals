package Labo8;

import java.util.Random;
import java.util.Scanner;

public class Oefening8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Maak je keuze: Blad, Steen of Schaar");
        String keuze = sc.next().toUpperCase();
        Random randomGenerator = new Random();
        int computerKeuzeInt = randomGenerator.nextInt(3);
        String computerKeuze;
        if (computerKeuzeInt == 0) {
            computerKeuze = "BLAD";
        } else if (computerKeuzeInt == 1) {
            computerKeuze = "STEEN";
        } else {
            computerKeuze = "SCHAAR";
        }
        while ((!keuze.equals("BLAD") && !keuze.equals("STEEN") && !keuze.equals("SCHAAR")) || keuze.equals(computerKeuze)) {
            System.out.println("Maak je keuze: Blad, Steen of Schaar");
            keuze = sc.next().toUpperCase();
        }
        if (keuze.equals("BLAD") && computerKeuze.equals("STEEN")) {
            System.out.printf("Jij koos '%s' en de computer koos '%s' => Jij bent gewonnen!", keuze, computerKeuze);
        }
        if (keuze.equals("BLAD") && computerKeuze.equals("SCHAAR")) {
            System.out.printf("Jij koos '%s' en de computer koos '%s' => De computer is gewonnen!", keuze, computerKeuze);
        }
        if (keuze.equals("STEEN") && computerKeuze.equals("BLAD")) {
            System.out.printf("Jij koos '%s' en de computer koos '%s' => De computer is gewonnen!", keuze, computerKeuze);
        }
        if (keuze.equals("STEEN") && computerKeuze.equals("SCHAAR")) {
            System.out.printf("Jij koos '%s' en de computer koos '%s' => Jij bent gewonnen!", keuze, computerKeuze);
        }
        if (keuze.equals("SCHAAR") && computerKeuze.equals("BLAD")) {
            System.out.printf("Jij koos '%s' en de computer koos '%s' => De computer is gewonnen!", keuze, computerKeuze);
        }
        if (keuze.equals("SCHAAR") && computerKeuze.equals("STEEN")) {
            System.out.printf("Jij koos '%s' en de computer koos '%s' => De computer is gewonnen!", keuze, computerKeuze);
        }
    }
}

