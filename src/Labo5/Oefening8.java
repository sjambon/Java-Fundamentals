package Labo5;

import java.util.HashMap;
import java.util.Scanner;

public class Oefening8 {
    public static void main(String[] args) {
        HashMap<Integer, String> basketbal = new HashMap<>();
        String groep = "Default";
        basketbal.put(8, "Premicroben");
        basketbal.put(10, "Microben");
        basketbal.put(12, "Benjamins");
        basketbal.put(14, "Pupillen");
        basketbal.put(16, "Miniemen");
        basketbal.put(18, "Cadetten");
        basketbal.put(20, "Juniores");
        basketbal.put(999, "Seniores");
        System.out.println("Geef je naam:");
        Scanner scanner = new Scanner(System.in);
        String naam = scanner.next();
        System.out.println("Geef je leeftijd:");
        int leeftijd = scanner.nextInt();
        for (int i=0; i< leeftijd; i+=2) {
            if (leeftijd%2 != 0) {
                leeftijd -= 1;
            }
            groep = basketbal.get(i);
        }
        if (groep.equals("Default")) {
            leeftijd = 6 - leeftijd;
            System.out.printf("%s, je bent nog iets te jong. \nBinnen %s jaar ben je van harte welkom!", naam, leeftijd);
        } else {
            System.out.printf("%s wordt ingeschreven bij %s", naam, groep);
        }




        /*if (leeftijd < 6) {
            leeftijd = 6 - leeftijd;
            System.out.printf("%s, je bent nog iets te jong. \nBinnen %s jaar ben je van harte welkom!", naam, leeftijd);
        } else if (leeftijd <= 8) {
            System.out.printf("%s wordt ingeschreven bij de Premicroben.", naam);
        } else if (leeftijd <= 10) {
            System.out.printf("%s wordt ingeschreven bij de Microben.", naam);
        } else if (leeftijd <= 12) {
            System.out.printf("%s wordt ingeschreven bij de Benjamins.", naam);
        } else if (leeftijd <= 14) {
            System.out.printf("%s wordt ingeschreven bij de Pupillen.", naam);
        } else if (leeftijd <= 16) {
            System.out.printf("%s wordt ingeschreven bij de Miniemen.", naam);
        } else if (leeftijd <= 18) {
            System.out.printf("%s wordt ingeschreven bij de Cadetten.", naam);
        } else if (leeftijd <= 20) {
            System.out.printf("%s wordt ingeschreven bij de Juniores.", naam);
        } else {
            System.out.printf("%s wordt ingeschreven bij de Seniores.", naam);
        }
        */
    }
}
