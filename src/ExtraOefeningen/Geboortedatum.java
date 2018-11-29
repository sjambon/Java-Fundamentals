package ExtraOefeningen;

import java.util.Calendar;

public class Geboortedatum implements Comparable<Geboortedatum> {

    private int dag;
    private int maand;
    private int jaar;

    public Geboortedatum(int dag, int maand, int jaar) throws Exception {
        if (dag > 0 && dag < 31) {
            this.dag = dag;
        } else {
            throw new Exception("Dag moet tussen de 1 en 31 liggen!");
        }
        if (maand > 0 && maand < 12) {
            this.maand = maand;
        } else {
            throw new Exception("Maand moet tussen de 1 en 12 liggen!");
        }
        if (jaar > 0 && jaar < 2018) {
            this.jaar = jaar;
        } else {
            throw new Exception("Jaar moet tussen de 1 en 2019 liggen!");
        }
    }

    public int geefLeeftijd() {
        Calendar calVandaag = Calendar.getInstance();
        int leeftijd = 2018 - jaar;
        if ((dag < calVandaag.get(Calendar.DAY_OF_MONTH) && maand == calVandaag.get(Calendar.MONTH)) || maand < calVandaag.get(Calendar.MONTH)) {
            leeftijd++;
        }
        return leeftijd;
    }

    @Override
    public int compareTo(Geboortedatum o) {
        return 0;
    }

    public String toString() {
        return String.format("%d/%d/%d", dag, maand, jaar);
    }
}
