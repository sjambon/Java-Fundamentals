package Labo8;

import java.util.Scanner;

public class Oefening2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoeveel getallen wil je ingeven?");
        int aantal = sc.nextInt();
        if (aantal <= 2) {
            System.out.println("ERROR: Je met minstens 3 getallen ingeven!");
        } else {
            System.out.printf("Geef %s getallen in:", aantal);
            int kleinste = sc.nextInt();
            int grootste = kleinste;
            int grootsteverschil = 0;
            for (int i = 2; i <= aantal; i++) {
                int getal = sc.nextInt();
                if (getal < kleinste) {
                    kleinste = getal;
                } else if (getal > grootste) {
                    grootste = getal;
                }
                grootsteverschil = grootste - kleinste;
            }
            System.out.printf("Het grootste verschil is %s , tussen de getallen %s en %s.", grootsteverschil, kleinste, grootste);
        }
    }
}
