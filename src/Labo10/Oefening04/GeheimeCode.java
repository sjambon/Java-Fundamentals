package Labo10.Oefening04;

/**
 * @author Steven Jambon
 * @version December 2018
 */

public class GeheimeCode {
    int[] code;
    int gokCounter;
    boolean isGeraden;
    final int MAX_GOK_COUNTER = 20;

    /**
     * constructor methode
     * @param code de geheime code die gekraakt moet worden.
     */

    public GeheimeCode(String code) {
        this.code = new int[]{code.charAt(0) - 48, code.charAt(1) - 48, code.charAt(2) - 48, code.charAt(3) - 48, code.charAt(4) - 48};
        this.gokCounter = 1;
        this.isGeraden = false;
    }

    /**
     * Bepaald hoeveel getallen van de gok op de juiste positie staan.
     *
     * @param gok string die vergeleken wordt met de code.
     * @return hoeveelheid getallen de op de juiste positie staan.
     */
    int juistePositie(String gok) {
        int[] gokArray = {gok.charAt(0) - 48, gok.charAt(1) - 48, gok.charAt(2) - 48, gok.charAt(3) - 48, gok.charAt(4) - 48};
        int aantalCorrect = 0;
        for (int i = 0; i < gokArray.length; i++) {
            for (int getal : code) {
                if (gokArray[i] == getal) {
                    if (gokArray[i] == code[i]) {
                        aantalCorrect++;
                    }
                }
            }
        }
        return aantalCorrect;
    }

    /**
     * Berekent de som van de getallen die op de juiste positie staan.
     *
     * @param gok string die vergeleken wordt met de code.
     * @return de som van de getallen die op de juist positie staan.
     */

    int berekenSom(String gok) {
        int[] gokArray = {gok.charAt(0) - 48, gok.charAt(1) - 48, gok.charAt(2) - 48, gok.charAt(3) - 48, gok.charAt(4) - 48};
        int som = 0;
        for (int i = 0; i < gokArray.length; i++) {
                if (gokArray[i] == code[i]) {
                    som += gokArray[i];
                }
            }
        return som;
    }
}