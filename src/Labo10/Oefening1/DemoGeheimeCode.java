package Labo10.Oefening1;

import java.util.Scanner;

public class DemoGeheimeCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een 5-cijferige code:");
        String code = sc.next();
        GeheimeCode geheimeCode = new GeheimeCode(code);

        while (geheimeCode.gokCounter < geheimeCode.MAX_GOK_COUNTER && !geheimeCode.isGeraden) {
            int gokCounter = geheimeCode.gokCounter;
            System.out.printf("Poging %s : geef de code:", gokCounter);
            String gok = sc.next();
            if (geheimeCode.juistePositie(gok) == 5) {
                System.out.printf("Poging %s : U heeft de code juist geraden!", gokCounter);
                geheimeCode.isGeraden = true;
            } else {
                System.out.printf("Poging %s: U heeft %s getallen geraden en de som van deze getallen is %s\n", gokCounter, geheimeCode.juistePositie(gok), geheimeCode.berekenSom(gok));
            }
            geheimeCode.gokCounter++;
        }
        if (geheimeCode.gokCounter == geheimeCode.MAX_GOK_COUNTER) {
            System.out.printf("Na %s pogingen is het je niet gelukt om de code te raden.", geheimeCode.gokCounter - 1);
        }

    }
}

