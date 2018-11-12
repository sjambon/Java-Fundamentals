package Labo7;

import java.util.Scanner;

public class Oefening1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef je beginkapitaal:");
        int kapitaal = scanner.nextInt();
        final int KAPITAAL = kapitaal*2;
        System.out.println("Geef je rentevoet in procent:");
        double rente = 1 + scanner.nextDouble()/100;
        int jaar = 0;
        while (kapitaal <= KAPITAAL) {
            kapitaal *= rente;
            jaar++;
        }
        System.out.printf("Het startkapitaal is verdubeld na %s jaar", jaar);
    }
}
