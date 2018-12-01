package Labo6;

import java.util.Scanner;

public class Oefening05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gemiddelde = 0;
        for(int i = 1; i <= 7; i++) {
            System.out.println("Geef een getal:");
            int getal = scanner.nextInt();
            int resultaat = getal * getal;
            gemiddelde += getal;
            System.out.printf("De macht van %s is %s\n", getal, resultaat);
        }
        gemiddelde /= 7.0;
        gemiddelde = Math.round(gemiddelde * 100) / 100.0;
        System.out.printf("Het gemiddelde van deze 7 getallen is: %s", gemiddelde);
    }
}