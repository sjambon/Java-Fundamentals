package Labo8;

import java.util.Random;
import java.util.Scanner;

public class Oefening09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoeveel ogen wil je werpen?");
        int aantalOgen = sc.nextInt();
        Random randomGenerator = new Random();
        int keerGeworpen = 1;
        int geworpenOgen = randomGenerator.nextInt(5)+1;
        System.out.printf("Poging %s : %s\n", keerGeworpen, geworpenOgen);
        while (geworpenOgen != aantalOgen) {
            geworpenOgen = randomGenerator.nextInt(5)+1;
            keerGeworpen++;
            System.out.printf("Poging %s : %s\n", keerGeworpen, geworpenOgen);
        }
        System.out.printf("In %s pogingen is het gelukt om %s te gooien.", keerGeworpen, aantalOgen);
    }
}
