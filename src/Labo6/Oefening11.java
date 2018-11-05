package Labo6;

import java.util.Scanner;

public class Oefening11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een getal:");
        int getal = scanner.nextInt();
        String topAndBottom = "";
        String spaties = "";
        for (int k = 3; k <= getal; k++) {
            spaties += " ";
        }
        for (int i = 1; i <= getal; i++) {
            if (i == 1 || i == getal) {
                topAndBottom += "+";
            } else {
                topAndBottom += "-";
            }
        }
        System.out.println(topAndBottom);
        for (int j = 1; j <= getal; j++) {
            if (j % 2 == 0) {
                System.out.println("\\" + spaties + "/");
            } else {
                System.out.println("/" + spaties + "\\");
            }
        }
        System.out.println(topAndBottom);
    }

}
