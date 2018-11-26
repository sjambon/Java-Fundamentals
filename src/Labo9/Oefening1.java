package Labo9;

import java.util.Scanner;

public class Oefening1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Geef een woord");
            array[i] = sc.next();
        }
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (String item : array) {
            System.out.println(item);
        }
    }
}
