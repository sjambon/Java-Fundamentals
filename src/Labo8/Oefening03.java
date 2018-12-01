package Labo8;

import java.util.Scanner;

public class Oefening03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een zin waarin minstens 1 keer 'Pascal' in voorkomt.");
        String zin = sc.nextLine();
        if (!zin.contains("Pascal") && !zin.contains("pascal")) {
            System.out.println("ERROR: de zin moet het woord 'pascal' bevatten.");
        } else {
            while (zin.contains("pascal")) {
                int pascalLocatie = zin.indexOf("pascal");
                zin = zin.substring(0, pascalLocatie) + "java" + zin.substring(pascalLocatie + 6);
                System.out.println(zin);
            }
        }
    }
}
