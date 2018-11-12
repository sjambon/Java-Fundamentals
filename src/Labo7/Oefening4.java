package Labo7;

import java.util.Scanner;

public class Oefening4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een woord:");
        String woord = scanner.next();
        double percentage = Math.round((telKlinkers(woord)/(double)woord.length())*100);
        System.out.printf("Het woord %s bestaat voor %s procent uit klinkers.", woord, percentage);
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
}
