package Labo12.Oefening02;

public class Zoekertje {
    private String langeTekst;
    private String klinkers;

    public Zoekertje(String langeTekst) {
        this.langeTekst = langeTekst;
        this.klinkers = "aeiou";
    }

    public String vertaal() {
        String outputString = "";
        String[] woorden = langeTekst.split("\\s+");
        for (int i = 0; i < woorden.length; i++) {
            if (klinkers.indexOf(Character.toLowerCase(woorden[i].charAt(0))) == -1) {
                outputString += woorden[i].replaceAll("[AaEeIiOoUu]", "") + " ";
            } else {
                outputString += woorden[i].charAt(0) + woorden[i].substring(1).replaceAll("[AaEeIiOoUu]", "") + " ";
            }
        }
        return outputString;
    }
}
