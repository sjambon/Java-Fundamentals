package Labo5;

import java.util.Scanner;

public class Oefening07 {
    public static void main(String[] args) {
      System.out.println("Geef je leeftijd:");
        Scanner scanner = new Scanner(System.in);
        int prijs = 0;
        int leeftijd = scanner.nextInt();
        if (leeftijd <= 9) {
        } else if (leeftijd <= 20 ) {
            prijs = 4;
        } else if (leeftijd <= 64) {
            prijs = 6;
        } else {
            prijs = 5;
        }
        System.out.printf("Het te betalen bedrag bedraagt %s euro.", prijs);
    }
}
