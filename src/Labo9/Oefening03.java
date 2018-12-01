package Labo9;

public class Oefening03 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100.0 - 50.0);
        }
        int resultaat = 0;
        for (int item : array) {
            resultaat += item;
        }
        System.out.printf("Het resultaat van het optellen van alle getallen in een array met 100 getallen is %s.", resultaat);
    }
}
