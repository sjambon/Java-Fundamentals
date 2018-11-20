package Labo10;

import java.util.Scanner;

public class Oefening5 {

    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100.0);
        }
        System.out.println("Geef een getal:");
        int getal = sc.nextInt();
        int aantal = max25VerschilMetGetal(array, getal);
        System.out.printf("Er %s waarden die max 25 verschillen met %s.", aantal, getal);
    }

    private static int max25VerschilMetGetal(int[] array, int getal) {
        int count = 0;
        for (int item : array) {
            if (getal >= item - 25 && getal <= item + 25) {
                count++;
            }
        }
        return count;
    }
}
