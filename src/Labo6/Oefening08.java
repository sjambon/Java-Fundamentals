package Labo6;

import java.util.Scanner;

public class Oefening08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een woord:");
        String woord = scanner.next();
        String resultaat;
        for(int i = woord.length(); i > 1; i--) {
            resultaat = woord.substring(0, i);
            System.out.println(resultaat);
        }
        for(int i = 1; i <= woord.length(); i++) {
            resultaat = woord.substring(0,i);
            System.out.println(resultaat);
        }
    }
}