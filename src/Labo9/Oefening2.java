package Labo9;

public class Oefening2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int getal = 5;
        checkIfInArray(getal, array);
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
