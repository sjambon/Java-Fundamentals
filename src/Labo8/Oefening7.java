package Labo8;

import java.util.Scanner;

public class Oefening7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een getal:");
        int getal = sc.nextInt();
        StringBuilder lijn = new StringBuilder();
        for (int i = 1; i < getal; i++) {
            for (int j = 1; j <= getal; j++) {
                lijn.append(i*j).append("\t");
            }
            System.out.println(lijn.toString());
            lijn = new StringBuilder();
        }
    }
}
