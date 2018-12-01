package Labo9;

import java.util.Scanner;

public class Oefening09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] code = {1, 2, 3, 4, 5};
        final int MAX_GOKKEN = 10;
        int gokCounter = 0;
        boolean geraden = false;
        while (gokCounter < MAX_GOKKEN && !geraden) {
            System.out.printf("Poging %s : geef de code:", gokCounter + 1);
            String gok = sc.next();
            int[] gokArray = {gok.charAt(0) - 48, gok.charAt(1) - 48, gok.charAt(2) - 48, gok.charAt(3) - 48, gok.charAt(4) - 48};
            int aantalCorrect = 0;
            int som = 0;
            for (int i = 0; i < gokArray.length; i++) {
                for (int getal : code) {
                    if (gokArray[i] == getal) {
                        if (gokArray[i] == code[i]) {
                            aantalCorrect++;
                        }
                        som += gokArray[i];
                    }
                }
            }
            if (aantalCorrect == 5) {
                System.out.printf("Poging %s : U heeft de code juist geraden!", gokCounter + 1);
                geraden = true;
            } else {
                System.out.printf("Poging %s: U heeft %s getallen geraden en de som van deze getallen is %s\n", gokCounter + 1, aantalCorrect, som);
                gokCounter++;
            }
        }
        if (gokCounter == MAX_GOKKEN) {
            System.out.printf("Na %s pogingen is het je niet gelukt om de code te raden.", gokCounter);
        }
    }
}