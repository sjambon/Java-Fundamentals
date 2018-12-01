package IndividueleLabos.IndividueelLabo1;

import java.util.Scanner;

public class InktJetPrinter {
    public static void main(String[] args) {
        final double AFDRUKSNELHEID = 15.0 / 33.0;
        double inktHoeveelheid = 19.0;
        final int NORMAL_AMOUNT = 500;
        final int ECONOMY_AMOUNT = 800;

        System.out.println("Hoeveel pagina's wil je printen?");
        Scanner scanner = new Scanner(System.in);
        int aantalPaginas = scanner.nextInt();
        double printTijd = Math.round(aantalPaginas * AFDRUKSNELHEID * 100) / 100.0;
        System.out.println("Je printopdracht zal slechts " + printTijd + " seconden duren.");
        System.out.println("In welke printmodus staat je printer? Normaal of Economy? (Antwoord met 'n' of 'e'");
        char modus = scanner.next().charAt(0);
        double inkt10Normaal = inktHoeveelheid / NORMAL_AMOUNT;
        double inkt10Economy = inktHoeveelheid / ECONOMY_AMOUNT;
        double modusN = Math.round(aantalPaginas * inkt10Normaal * 100) / 100.0;
        double modusE = Math.round(aantalPaginas * inkt10Economy * 100) / 100.0;
        double inktVerbruik = (modus == 'n' ? modusN : modusE);
        System.out.println("Tijdens deze print-opdracht heb je " + inktVerbruik + " ml inkt verbruikt. \nVoor elke 10 pagina's zal je 0.24ml inkt verbruiken in de economy modus. \nVoor elke 10 pagina's zal je printer 0.38 ml inkt verbruiken in de normaal modus.");
    }
}