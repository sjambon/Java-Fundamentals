package IndividueleLabos.IndividueelLabo2;

import java.util.Scanner;

public class Scrambler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wil je een woord scramblen of descramblen? \nAntwoord met s of d");
        String optie = sc.next();
        if (optie.equals("s")) {
            System.out.println("Geef het woord dat je wil scramblen:");
            String woord = sc.next();
            if (woord.length() < 4) {
                System.out.println("Error je woord moet minstens 4 letters hebben !");
            } else {
                char beginLetter;
                char middelsteLetter;
                char derdelaatsteLetter;
                char voorlaatsteLetter;
                int midden;
                if (woord.length() % 2 == 0) {
                    midden = woord.length() / 2 + 1;
                } else {
                    midden = woord.length() / 2;
                }
                middelsteLetter = woord.charAt(midden);
                beginLetter = woord.charAt(0);
                woord = middelsteLetter + woord.substring(1, midden) + beginLetter + woord.substring(midden + 1);
                System.out.println("Stap 1 geeft " + woord);
                derdelaatsteLetter = woord.charAt(woord.length() - 3);
                voorlaatsteLetter = woord.charAt(woord.length() - 2);
                woord = woord.substring(0, woord.length() - 3) + voorlaatsteLetter + derdelaatsteLetter + woord.substring(woord.length() - 1);
                System.out.println("Stap 2 geeft " + woord);
                if (Character.toString(woord.charAt(woord.length() - 1)).equals("a") || Character.toString(woord.charAt(woord.length() - 1)).equals("e") || Character.toString(woord.charAt(woord.length() - 1)).equals("i") || Character.toString(woord.charAt(woord.length() - 1)).equals("o") || Character.toString(woord.charAt(woord.length() - 1)).equals("u")) {
                    woord = woord + woord.charAt(woord.length() - 1);
                    System.out.println("Stap 3 geeft : " + woord);
                }
            }
        } else if (optie.equals("d")) {
            System.out.println("Geef het woord dat je wil descramblen:");
            String woord = sc.next();
            if (woord.length() < 4) {
                System.out.println("Error je woord moet minstens 4 letters hebben !");
            } else {
                char beginLetter;
                char middelsteLetter;
                char derdelaatsteLetter;
                char voorlaatsteLetter;
                int midden;
                if (woord.length() % 2 == 0) {
                    midden = woord.length() / 2 + 1;
                } else {
                    midden = woord.length() / 2;
                }
                if (Character.toString(woord.charAt(woord.length() - 1)).equals("a") || Character.toString(woord.charAt(woord.length() - 1)).equals("e") || Character.toString(woord.charAt(woord.length() - 1)).equals("i") || Character.toString(woord.charAt(woord.length() - 1)).equals("o") || Character.toString(woord.charAt(woord.length() - 1)).equals("u")) {
                    woord = woord.substring(0, woord.length() - 1);
                    System.out.println("Stap 1 geeft " + woord);
                }
                derdelaatsteLetter = woord.charAt(woord.length() - 3);
                voorlaatsteLetter = woord.charAt(woord.length() - 2);
                woord = woord.substring(0, woord.length() - 3) + voorlaatsteLetter + derdelaatsteLetter + woord.substring(woord.length() - 1);
                System.out.println("Stap 2 geeft " + woord);
                middelsteLetter = woord.charAt(midden);
                beginLetter = woord.charAt(0);
                woord = middelsteLetter + woord.substring(1, midden) + beginLetter + woord.substring(midden + 1);
                System.out.println("Stap 3 geeft " + woord);
            }
        } else {
            System.out.println("Error je moet met een s of d antwoorden !");
        }
    }
}

