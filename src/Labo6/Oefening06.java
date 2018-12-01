package Labo6;

import java.util.Scanner;

public class Oefening06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Van hoeveel woorden zou je de lengte willen weten?");
        int aantal = scanner.nextInt();
        int resultaat = 0;
        for (int i = 1; i <= aantal; i++) {
            System.out.println("Geef een woord:");
            String woord = scanner.next();
            resultaat += woord.length();
        }
        System.out.printf("De lengte van %s woorden is %s.", aantal, resultaat);
    }
}

