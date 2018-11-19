package Labo8;

import java.util.Scanner;

public class Oefening4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een woord in:");
        String woord = sc.next();
        StringBuilder omgekeerd = new StringBuilder();
        for (int i = woord.length() - 1; i >= 0; i--) {
            omgekeerd.append(woord.charAt(i));
        }
        if (omgekeerd.toString().equals(woord)) {
            System.out.printf("Het woord '%s' is een palindroom.", woord);
        } else {
            System.out.printf("Het woor '%s' is geen palindroom want het omgekeerde van '%s' is '%s'.", woord, woord, omgekeerd);
        }
    }
}
