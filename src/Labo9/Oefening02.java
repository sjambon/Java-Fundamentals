package Labo9;

import Miscellaneous.RandomArray;

import java.util.Arrays;
import java.util.Scanner;

public class Oefening02 {
    public static void main(String[] args) {
        int[] array = RandomArray.createIntArray(10,10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een getal dat gezocht moet worden in de willekeurige array:");
        int getal = sc.nextInt();
        System.out.printf("Bevindt het getal %s zich in de array %s?: %s",getal, Arrays.toString(array), checkIfInArray(getal, array));
    }

    private static boolean checkIfInArray(int getal, int[] array) {
        for (int item : array) {
            if (item == getal) {
                return true;
            }
        }
        return false;
    }
}
