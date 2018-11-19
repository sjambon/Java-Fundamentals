package Labo8;

import java.util.Scanner;

public class Oefening6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een getal tussen 1 en 20:");
        int getal = sc.nextInt();
        if (getal < 0 || getal > 20) {
            System.out.printf("ERROR: het getal %s ligt niet tussen de 1 en 20.", getal);
        } else {
            int fibonacci = 0, waarde = 1;

            for (int i = 1; i <= getal; i++) {
                fibonacci += waarde;
                waarde = fibonacci - waarde;
            }
            System.out.printf("Het resultaat is %s.", fibonacci);
        }
    }
}
