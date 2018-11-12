package Labo7;

import java.util.Scanner;

public class Oefening3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een waarde voor x :");
        double x = scanner.nextDouble();
        final double FOUT = 0.000001;
        int count = 1;
        double totaal = 1;
        double partieelsom;
        do {
            partieelsom = 1;
            for (int i = 0; i <= count; i++) {
                partieelsom = partieelsom * (x / i);
            }
            count++;
            totaal += partieelsom;
        } while (partieelsom > FOUT);
        System.out.println(totaal);
    }
}