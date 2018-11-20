package Labo10;

import java.util.Arrays;

public class Oefening4 {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10.0);
        }
        System.out.printf("Array met 10 willekeurige getallen: %s.\n", Arrays.toString(array));
        int[] metHulpArray = metHulpArray(array);
        int[] zonderHulpArray = zonderHulpArray(array);
        System.out.printf("Array met behulp van een hulp array: %s.\n", Arrays.toString(metHulpArray));
        System.out.printf("Array zonder gebruik te maken van een hulp array: %s.", Arrays.toString(zonderHulpArray));

    }
    private static int[] metHulpArray(int[] array) {
        int[] hulpArray = new int[10];
        for (int j = 1; j < array.length; j++) {
            hulpArray[j] = array[array.length-j];
        }
        array = hulpArray;
        return array;
    }

    private static int[] zonderHulpArray(int[] array) {
        for(int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
