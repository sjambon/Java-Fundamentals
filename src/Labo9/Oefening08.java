package Labo9;

import java.util.Random;

public class Oefening08 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int[] array = new int[9];
        for (int i = 0; i < 100; i++) {
            int getal = randomGenerator.nextInt(9);
            for (int j = 0; j < array.length; j++) {
                if (j == getal) {
                    array[j]++;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.printf("Het getal %s is %s keer gegenereerd.\n", i+1, item);
        }
    }
}
