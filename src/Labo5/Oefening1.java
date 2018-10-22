package Labo5;

import java.util.Scanner;

public class Oefening1 {
    public static void main(String[] args) {
        System.out.println("Geef een woord:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (Character.isDigit(input.charAt(0))) {
            System.out.printf("Het karakter %s is numeriek.", input.charAt(0));
        } else if (Character.isAlphabetic(input.charAt(0))) {
            if (Character.isUpperCase(input.charAt(0))) {
                System.out.printf("Het karakter %s is een hoofdletter.", input.charAt(0));
            } else {
                System.out.printf("Het karakter %s is een kleine letter.", input.charAt(0));
            }
        } else {
            System.out.printf("Het karakter %s is een cijfer of letter.", input.charAt(0));
        }
    }
}
