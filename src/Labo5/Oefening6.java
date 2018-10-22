package Labo5;

import java.util.Scanner;

public class Oefening6 {
    public static void main(String[] args) {
        System.out.println("Geef een getal:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Geef een ander getal:");
        int y = scanner.nextInt();
        if (x >= 0 && y >= 0) {
            System.out.printf("x + y : %s", x + y);
        } else if (x >= 0 && y < 0) {
            System.out.printf("x + y^2 : %s", x + y * y);
        } else if (x < 0 && y >= 0) {
            System.out.printf("x^2 + y : %s", x * x + y);
        } else if (x < 0 && y < 0) {
            System.out.printf("x^2 + y^2 : %s", x * x + y * y);
        }
    }
}
