package Labo12.Oefening01;

class Quiz {

    private String[] vragen;
    private String[] antwoorden;

    Quiz(String[] vragen, String[] antwoorden) {
        this.vragen = vragen;
        this.antwoorden = antwoorden;
    }

    String geefVraag() {
        return vragen[(int)(Math.random() * (vragen.length-1))];
    }

    boolean checkAntwoordVraag(String vraag, String antwoord) {
        for (int i = 0; i < vragen.length; i++) {
            if (vragen[i].equals(vraag) && antwoorden[i].equals(antwoord)) {
                return true;
            }
        }
        return false;
    }

    void voegVraagAntwoordToe(String vraag, String antwoord) {
        String[] nieuweVragen = new String[vragen.length];
        String[] nieuweAntwoorden = new String[vragen.length];
        for (int i = 0; i < vragen.length; i++) {
            nieuweVragen[i] = vragen[i];
            nieuweAntwoorden[i] = antwoorden[i];
        }
        for (int i = 0; i < vragen.length - 1; i++) {
            if (!vragen[i].equals(vraag) && !antwoorden[i].equals(antwoord)) {
                nieuweVragen[nieuweVragen.length-1] = vraag;
                nieuweAntwoorden[nieuweAntwoorden.length-1] = antwoord;
                this.vragen = nieuweVragen;
                this.antwoorden = nieuweAntwoorden;
            }
        }
    }
}
