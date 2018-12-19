package Labo12.Oefening01;

public class Quiz {

    private String[] vragen;
    private String[] antwoorden;

    public Quiz(String[] vragen, String[] antwoorden) {
        this.vragen = vragen;
        this.antwoorden = antwoorden;
    }

    public String geefVraag() {
        return vragen[(int)(Math.random() * (vragen.length-1))];
    }

    public boolean checkAntwoordVraag(String vraag, String antwoord) {
        for (int i = 0; i < vragen.length; i++) {
            if (vragen[i].equals(vraag) && antwoorden[i].equals(antwoord)) {
                return true;
            }
        }
        return false;
    }

    public void voegVraagAntwoordToe(String vraag, String antwoord) {
        int lengte = vragen.length;
        String[] nieuweVragen = new String[lengte];
        String[] nieuweAntwoorden = new String[lengte];
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
