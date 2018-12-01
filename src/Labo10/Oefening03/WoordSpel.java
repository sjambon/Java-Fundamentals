package Labo10.Oefening03;

public class WoordSpel {
    final int MAX_BEURTEN = 20;
    String[] array;
    String woord;
    boolean[] lettersGeraden;
    int beurten;

    WoordSpel(String[] array, String woord) {
        this.woord = woord;
        this.array = array;
        this.beurten = 1;
        this.lettersGeraden = new boolean[woord.length()];
    }

    boolean isGeraden() {
        for (boolean item : lettersGeraden) {
            if (!item) {
                return false;
            }
        }
        return true;
    }

    String gok(char letter) {
        StringBuilder outputString = new StringBuilder();
        outputString.append("Poging ").append(beurten).append(" : ");
        for (int i = 0; i < woord.length(); i++) {
            if (woord.charAt(i) == letter) {
                lettersGeraden[i] = true;
            }
        }
        for (int i = 0; i < lettersGeraden.length; i++) {
            if (lettersGeraden[i]) {
                outputString.append(woord.charAt(i));
            } else {
                outputString.append("_");
            }
        }
        return outputString.toString();
    }

    String gok(String guess) {
        if (woord.equals(guess)) {
            for (int i = 0; i < lettersGeraden.length; i++) {
                lettersGeraden[i] = true;
            }
            return String.format("Proficiat, u heeft het woord geraden na %d poging(en).", beurten);
        } else {
            StringBuilder outputString = new StringBuilder();
            outputString.append("Poging ").append(beurten).append(" : ");

            for (int i = 0; i < woord.length(); i++) {
                if (lettersGeraden[i]) {
                    outputString.append(woord.charAt(i));
                } else {
                    outputString.append("_");
                }
            }
            return outputString.toString();
        }
    }
}