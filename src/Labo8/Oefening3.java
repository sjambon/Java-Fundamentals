package Labo8;

import java.util.Scanner;

public class Oefening3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een zin waarin minstens 1 keer 'Pascal' in voorkomt.");
        String zin = sc.nextLine();
        if (!zin.contains("Pascal") && !zin.contains("pascal")) {
            System.out.println("ERROR: de zin moet het woord 'pascal' bevatten.");
        } else {
            zin = zin.replace("pascal", "java");
            zin = zin.replace("Pascal", "Java");
            System.out.println(zin);
        }
    }
}
