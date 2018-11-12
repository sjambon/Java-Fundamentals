package Labo7;

import java.util.Scanner;

public class Oefening5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een woord:");
        String woord = scanner.next();
        String kortste = woord;
        while (!woord.equals("stop")) {
            System.out.println("Geef nog een woord of 'stop' om te stoppen");
            woord = scanner.next();
            if (woord.length() < kortste.length()) {
                kortste = woord;
            }
        }
        System.out.printf("Het korste woord van de reeks woorden is '%s'.", kortste);
    }
}
