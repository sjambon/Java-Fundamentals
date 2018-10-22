package Labo5;

import java.util.Scanner;

public class Oefening2 {
    public static void main(String[] args) {
        System.out.println("Geef een woord:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.length()%2==0) {
            System.out.println(input.toUpperCase());
        } else {
            System.out.println(input.toLowerCase());
        }
    }
}
