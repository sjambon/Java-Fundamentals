package Labo9;

import java.util.Scanner;

public class Oefening01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Geef een getal");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
