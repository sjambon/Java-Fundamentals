package Labo11.Oefening01;

import java.util.Random;
import java.util.Scanner;

public class DemoWoordspel {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        Scanner sc = new Scanner(System.in);
        String[] array = {"monitor", "program", "application", "keyboard", "javascript", "python", "controller", "speakers", "gaming", "network"};
        String woord = array[randomGenerator.nextInt(10)];
        WoordSpel spel = new WoordSpel(array, woord);
        while (!spel.isGeraden() && spel.beurten <= spel.MAX_BEURTEN) {
            System.out.println("Geef je letter of het volledige woord:");
            String gok = sc.next();
            if (gok.length() == 1) {
                System.out.println(spel.gok(gok.charAt(0)));
            } else {
                System.out.println(spel.gok(gok));
            }
            spel.beurten++;
        }
    }
}
