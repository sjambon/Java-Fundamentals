package Labo6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Oefening10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getal = 0;
        System.out.println("Geef een getal (1-20):");
        try {
            getal = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Ongeldige Waarde");
            System.exit(0);
        }
        if (getal > 20 || getal < 1) {
            System.out.println("Ongeldige Waarde");
        } else {
            for (int i = 1; i <= getal; i++) {
                for (int j = 0; j < getal - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
                for (int k = 0; k < getal - i; k++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
