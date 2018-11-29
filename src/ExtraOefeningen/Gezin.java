package ExtraOefeningen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gezin implements IGezin {
    private Adres adres;
    private List<Persoon> gezinsleden;

    Gezin() {
        this.gezinsleden = new ArrayList<>();
        this.adres = null;
    }

    public double berekenGezinsInkomen() {
        return 0.0;
    }

    public void setAdres(Adres nieuwAdres) {
        this.adres = nieuwAdres;
    }

    public void voegGezinslidToe(Kind kind) {
        gezinsleden.add(kind);
    }

    public void voegGezinslidToe(Ouder ouder) {
        gezinsleden.add(ouder);
    }

    public List<Persoon> getGezinsleden() {
        return gezinsleden;
    }

    public String toString() {
        StringBuilder printString = new StringBuilder();
        for (Persoon persoon : gezinsleden) {
            printString.append(persoon.toString()).append("\n");
        }
        return printString.toString();
    }

    @Override
    public double bepaalZakgeld(double gezinsinkomen, int leeftijdKind) {
        if (leeftijdKind >= 12) {
            return (leeftijdKind * 2 * gezinsinkomen / 1000);
        } else {
            return 0.0;
        }
    }

    @Override
    public Ouder bepaalGezinshoofd() {
        Ouder gezinshoofd = null;
        Collections.sort(gezinsleden);
        for (Persoon persoon : gezinsleden) {
            if (persoon.getGeslacht() == Geslacht.MAN && persoon instanceof Ouder) {
                gezinshoofd = (Ouder) persoon;
            }
        }
        return gezinshoofd;
    }
}
