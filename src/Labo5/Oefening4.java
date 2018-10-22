package Labo5;

import java.util.Scanner;

public class Oefening4 {
    public static void main(String[] args) {
        final int TARIEF1VAST = 75, TARIEF2VAST = 50;
        final int TRIEF1VAR = 1, TARIEF2VAR = 2;
        System.out.println("Geef je volume in kubieke meter:");
        Scanner scanner = new Scanner(System.in);
        int volume = scanner.nextInt();
        double tarief1 = (75 + volume * TRIEF1VAR) * 1.06;
        double tarief2 = (50 + volume * TARIEF2VAR) * 1.06;
        if (tarief1 > tarief2) {
            System.out.printf("Bij een volume van %s kubieke meter zijn de kosten %s euro.", volume, tarief2);
        } else if (tarief1 < tarief2) {
            System.out.printf("Bij een volume van %s kubieke meter zijn de kosten %s euro.", volume, tarief1);
        } else {
            System.out.printf("Bij een volume van %s kubieke meter zijn de kosten %s euro. Hierbij is er geen prijsverschil tussen onze tarieven.", volume, tarief2);
        }
    }
}
