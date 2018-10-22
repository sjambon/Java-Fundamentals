package Labo5;

import java.util.Scanner;

public class Oefening10 {
    public static void main(String[] args) {
        System.out.println("Geef een engels woord:");
        Scanner scanner = new Scanner(System.in);
        String woord = scanner.next();
        String beginkarakter = Character.toString(woord.charAt(0));
        if (beginkarakter.equals("a") || beginkarakter.equals("e") || beginkarakter.equals("o") || beginkarakter.equals("u")) {
            woord = "an " + woord;
        } else {
            woord = "a " + woord;
        }
        System.out.printf("Dit wordt : %s", woord);
    }
}

