package Miscellaneous;

public class RandomArray {

    public static int[] createIntArray(int aantal, double range) {
        int[] array = new int[aantal];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range);
        }
        return array;
    }
}
