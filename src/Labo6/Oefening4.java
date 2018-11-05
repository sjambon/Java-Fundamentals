package Labo6;

import java.util.Scanner;

public class Oefening4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultaat = 0;
        System.out.println("Geef een getal:");
        int getal = scanner.nextInt();
        System.out.println("Geef een tweede getal:");
        int getal2 = scanner.nextInt();
        String lijn = getal + "*" + getal2 + " = ";
        for (int i = 1; i < getal2; i++) {
            lijn += getal + " + ";
        }
        lijn += getal;
        System.out.println(lijn);
    }
}

