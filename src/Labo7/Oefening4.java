package Labo7;

import java.util.Scanner;

public class Oefening4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een woord:");
        String woord = scanner.next();
        int aantal = 0;
        int i = 0;
        while (i < woord.length()) {
            if (woord.charAt(i) == 'a' || woord.charAt(i) == 'e' || woord.charAt(i) == 'i'
                    || woord.charAt(i) == 'o' || woord.charAt(i) == 'u') {
                aantal++;
            }
            i++;
        }
        double percentage = Math.round((aantal/(double)woord.length())*100);
        System.out.printf("Het woord %s bestaat voor %s procent uit klinkers.", woord, percentage);
    }
}
