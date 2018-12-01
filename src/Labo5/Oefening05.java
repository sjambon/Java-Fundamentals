package Labo5;

import java.util.Scanner;

public class Oefening05 {
    public static void main(String[] args) {
        int[] maanden = new int[]{31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dagen;
        System.out.println("Geef een maand naar keuze:");
        Scanner scanner = new Scanner(System.in);
        int maand = scanner.nextInt();
        if (maand == 2) {
            System.out.println("Is het een schrikkeljaar?");
            boolean schrikkeljaar = scanner.nextBoolean();
            if (schrikkeljaar) {
                dagen = 29;
            } else {
                dagen = 28;
            }
        } else {
            dagen = maanden[maand + 1];
        }

        System.out.printf("De opgegeven maand bevat %s dagen", dagen);
    }
}

