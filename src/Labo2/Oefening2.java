package Labo2;

/**
 * Dit programma berekend enkele waarden.
 *
 * @author Steven Jambon
 * @version 1 oct 2018
 */

public class Oefening2 {
    public static void main(String[] args) {
        int getal1 = 5;
        int getal2 = 2;
        int getal3 = 3;
        int getal4 = 7;
        int aantal = 4;

        int totaal = (getal1 + getal2 + getal3 + getal4);
        int gemiddelde1 = totaal / aantal; // Gehele gemiddelde
        double gemiddelde2 = totaal / aantal; // Reeel gemiddelde
        int rest = totaal % aantal;


        System.out.println("De waarden van je variabelen zijn: " + getal1 + ", " + getal2 + ", " + getal3 + " en " + getal4);
        System.out.println("Het gehele gemiddelde is: " + gemiddelde1);
        System.out.println("De gehele rest is: " + rest);
        System.out.println("Het gemiddelde is: " + gemiddelde2);
    }
}
