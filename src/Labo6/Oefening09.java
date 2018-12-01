package Labo6;

import java.util.Scanner;

public class Oefening09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef breedte (1-10):");
        int breedte = scanner.nextInt();
        System.out.println("Geef hoogte (1-10):");
        int hoogte = scanner.nextInt();
        System.out.println("Geef een karakter:");
        char karakter = scanner.next().charAt(0);
        if (hoogte > 10 || hoogte < 1 || breedte > 10 || breedte < 1) {
            System.out.println("Ongeldige grootte");
        } else {
            StringBuilder lijn = new StringBuilder();

            for (int i = 1; i < breedte; i++) {
                lijn.append(karakter).append(" ");
            }
            lijn.append(karakter);
            for (int j = 0; j < hoogte; j++) {
                System.out.println(lijn);
            }
        }
    }
}

