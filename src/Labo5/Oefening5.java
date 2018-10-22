package Labo5;

import java.util.Scanner;

public class Oefening5 {
    public static void main(String[] args) {
        System.out.println("Geef een maand naar keuze:");
        Scanner scanner = new Scanner(System.in);
        int maand = scanner.nextInt();
        int dagen = 0;
        switch (maand) {
            case 1:
                dagen = 31;
                break;
            case 2:
                System.out.println("Is het een schrikkeljaar?");
                boolean schrikkeljaar = scanner.nextBoolean();
                if (schrikkeljaar) {
                    dagen = 29;
                } else {
                    dagen = 28;
                }
                break;
            case 3:
                dagen = 31;
                break;
            case 4:
                dagen = 30;
                break;
            case 5:
                dagen = 31;
                break;
            case 6:
                dagen = 30;
                break;
            case 7:
                dagen = 31;
                break;
            case 8:
                dagen = 31;
                break;
            case 9:
                dagen = 30;
                break;
            case 10:
                dagen = 30;
                break;
            case 11:
                dagen = 31;
                break;
            case 12:
                dagen = 30;
                break;
        }
        System.out.printf("De opgegeven maand bevat %s dagen", dagen);
    }
}

