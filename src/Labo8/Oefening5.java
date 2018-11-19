package Labo8;

import java.util.Scanner;

public class Oefening5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een getal:");
        int getal = sc.nextInt();
        int i = 0;
        int resultaat = 0;
        while (i <= getal) {
            resultaat += Math.pow(-1,i+1)*i;
            i++;
        }
        System.out.printf("De uitkomst van het getal %s is %s.", getal, resultaat);
    }
}
