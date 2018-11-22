package Labo10;

import Miscellaneous.*;

import java.util.Arrays;

public class Oefening6 {

    public static void main(String[] args) {
        int[] array = RandomArray.createIntArray(10, 10.0);
        System.out.printf("De originele array is: %s \nDe gesorteerde versie hiervan is: %s", Arrays.toString(array), Arrays.toString(sorteer(array)));
    }

    private static int[] sorteer(int[] array) {
        int position = 0;
        int temp;
        while (position < array.length - 1) {
            int[] subArray = Arrays.copyOfRange(array, position, array.length);
            int kleinste = subArray[0];
            for (int i = 0; i < subArray.length; i++) {
                if (subArray[i] <= kleinste) {
                    kleinste = subArray[i];
                    temp = array[position];
                    array[position + i] = temp;
                    array[position] = kleinste;
                }
            }
            position++;
        }
        return array;
    }
}
