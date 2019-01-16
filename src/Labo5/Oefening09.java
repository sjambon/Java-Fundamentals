package Labo5;

import java.util.Scanner;

public class Oefening09 {
    public static void main(String[] args) {
        System.out.println("Geef de tijd:");
        Scanner scanner = new Scanner(System.in);
        String uur = scanner.next();
        if (Character.isAlphabetic(uur.charAt(uur.length() - 1))) { //Omzetten naar normale tijd
            String ap = Character.toString(uur.charAt(uur.length() - 2));
            int uurVal = Integer.parseInt(uur.substring(0, uur.length()-2));
            if (ap.equals("A")) {
                System.out.printf("Het is %s uur", uurVal);
            } else {
                System.out.printf("Het is %s uur", uurVal + 12);
            }
        } else {
            int uurVal = Integer.parseInt(uur);
            if (uurVal > 12) {
                uurVal -= 12;
                uur = uurVal + "PM";
            } else {
                uur = uurVal + "AM";
            }
            System.out.printf("Het is %s", uur);
        }
    }
}
