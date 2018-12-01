package Labo7;

import java.util.Scanner;

public class Oefening02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getal = 1;
        int kwadraat = getal * getal;
        System.out.println("Geef een getal:");
        int gegevenGetal = scanner.nextInt();
        while (kwadraat < gegevenGetal) {
            getal ++;
            kwadraat = getal*getal;
        }
        System.out.printf("Het kleinste kwadraat groter dan %s is %s.", gegevenGetal, kwadraat);
    }
}
