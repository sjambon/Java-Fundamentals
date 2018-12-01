package Labo10.Oefening01;

class GeheimeCode {
    private int[] code;
    int gokCounter;
    boolean isGeraden;
    final int MAX_GOK_COUNTER = 20;

    GeheimeCode(String code) {
        this.code = new int[]{code.charAt(0) - 48, code.charAt(1) - 48, code.charAt(2) - 48, code.charAt(3) - 48, code.charAt(4) - 48};
        this.gokCounter = 1;
        this.isGeraden = false;
    }

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