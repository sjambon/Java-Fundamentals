package Labo10;

import java.util.Random;
import java.util.Scanner;

public class Oefening3 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        Scanner sc = new Scanner(System.in);
        String[] array = {"monitor", "program", "application", "keyboard", "javascript", "python", "controller", "speakers", "gaming", "network"};
        String woord = array[randomGenerator.nextInt(10)];
        WoordSpel spel = new WoordSpel(array, woord);
        while (!spel.isGeraden()) {
            System.out.println("Geef je letter of het volledige woord:");
            String gok = sc.next();
            if (gok.length()==1) {
                System.out.println(spel.gok(woord.charAt(0)));
            } else {
                System.out.println(spel.gok(woord));
            }
        }
    }

    public static class WoordSpel {
        String[] array;
        String woord;
        final int MAXBEURTEN = 20;
        int beurten;
        boolean[] woordGeraden;

        WoordSpel(String[] array, String woord) {
            this.woord = woord;
            this.array = array;
            this.beurten = 0;
            this.woordGeraden = new boolean[woord.length()];
        }

        private boolean isGeraden() {
            for (boolean item : woordGeraden) {
                if (!item) {
                    return false;
                }
            }
            return true;
        }

        private String gok(char letter) {
            if (beurten >= MAXBEURTEN) {
                return "";
            } else {
                beurten++;
                StringBuilder printWoord = new StringBuilder();
                StringBuilder printOut = new StringBuilder();
                for (int i = 0; i < woord.length(); i++) {
                    if (woord.charAt(i) == letter) {
                        woordGeraden[i] = true;
                    }
                }
                for (int i = 0; i < woordGeraden.length; i++) {
                    boolean item = woordGeraden[i];
                    if (item) {
                        printWoord.append(woord.charAt(i));
                    } else {
                        printWoord.append("_");
                    }
                }
                printOut.append("Beurt ").append(beurten).append(": ").append(printWoord);
                return printOut.toString();
            }
        }

        private String gok(String guess) {
            if (beurten >= MAXBEURTEN) {
                return "";
            } else {
                beurten++;
                if (woord.equals(guess)) {
                    for (int i = 0; i < woordGeraden.length; i++) {
                        woordGeraden[i] = true;
                    }
                    return guess;
                } else {
                    StringBuilder printWoord = new StringBuilder();
                    for (int i = 0; i < woord.length(); i++) {
                        if (woordGeraden[i]) {
                            printWoord.append(woord.charAt(i));
                        } else {
                            printWoord.append("_");
                        }
                    }
                    return printWoord.toString();
                }
            }
        }
    }
}
