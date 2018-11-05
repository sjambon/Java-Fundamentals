package Labo6;

import java.util.Scanner;

public class Oefening7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een aantal woorden:");
        String zin = scanner.nextLine();
        String langste = "";
        int langsteWoord = 0;
        String kortste = "";
        int kortsteWoord = zin.length();
        int woorden = telSpaties(zin);
        int spatie = 0;
        String woord;
        for (int j = 0; j < woorden; j++) {
            if (j < woorden - 1) {
                spatie = zin.indexOf(" ");
                woord = zin.substring(0, spatie);
                zin = zin.substring(spatie + 1);
            } else {
                woord = zin;
            }
            if (telKlinkers(woord) < kortsteWoord) {
                kortste = woord;
                kortsteWoord = telKlinkers(woord);
            } else if (telKlinkers(woord) > langsteWoord) {
                langste = woord;
                langsteWoord = telKlinkers(woord);
            }

        }
        System.out.printf("Het woord met de minste klinkers is %s en het woord met de meeste klinkers is %s.", kortste, langste);
    }

    private static int telKlinkers(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    private static int telSpaties(String str) {
        int count = 0;
        for (char i : str.toCharArray()) {
            if (i == ' ') {
                count++;
            }
        }
        count++;
        return count;
    }
}