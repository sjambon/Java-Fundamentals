package Labo9;

import java.util.Scanner;
import Miscellaneous.*;

public class Oefening5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = RandomArray.createIntArray(10, 100.0 - 50.0);
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
