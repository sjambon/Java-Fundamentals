package Labo6;

import java.util.Scanner;

public class Oefening9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef breedte (1-10):");
        int breedte = scanner.nextInt();
        System.out.println("Geef hoogte (1-10):");
        int hoogte = scanner.nextInt();
        if (hoogte > 10 || hoogte < 1 || breedte > 10 || breedte < 1) {
            System.out.println("Ongeldige grootte");
        } else {
            String lijn = "";

            for (int i = 1; i < breedte; i++) {
                lijn += "^ ";
            }
            lijn += "^";
            for (int j = 0; j < hoogte; j++) {
                System.out.println(lijn);
            }
        }
    }
}

