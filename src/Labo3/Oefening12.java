package Labo3;

import java.util.Scanner;

/**
 * Dit programma geeft een aantal seconden terug in HH:MM:SS.
 *
 * @author Steven Jambon
 * @version 8 oct 2018
 */

public class Oefening12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een aantal seconden in:");
        int seconden = scanner.nextInt();
        int uren = ((seconden - (seconden % 3600)) / 3600);
        seconden %= 3600;
        int minuten = ((seconden - (seconden % 60)) / 60);
        seconden %= 60;
        System.out.println((uren < 10 ? "0" + uren : uren) + ":" + (minuten < 10 ? "0" + minuten : minuten) + ":" + (seconden < 10 ? "0" + seconden : seconden));
        scanner.close();
    }
}