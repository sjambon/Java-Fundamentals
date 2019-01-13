package Labo7;

import java.util.Scanner;

public class Oefening03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een waarde voor x :");
        double x = scanner.nextDouble();
        final double FOUT = 0.000001;
        double partieelsom;
        int count = 1;
        double noemer = 1;
        double teller;
        double resultaat = 1;
        do {
            noemer *= count;
            teller = Math.pow(x, count);
            partieelsom = teller / noemer;
            resultaat += partieelsom;
            count++;
        } while (partieelsom > FOUT);
        System.out.println(resultaat);
    }
}