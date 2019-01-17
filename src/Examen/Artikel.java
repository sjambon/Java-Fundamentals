package Examen;

/**
 * Deze klasse zorgt ervoor dat er van een artikel kan bijgehouden worden welke
 * maten er in stock zijn en hoeveel er al van verkocht zijn.
 *
 * @author steven.jambon
 * @version Januari 2019
 */
public class Artikel {

    private final String BESCHRIJVING;
    private String[] matenTabel;
    private int[] aantallen;

    public Artikel(String beschrijving, String[] matenTabel) {
        this.BESCHRIJVING = beschrijving;
        this.matenTabel = matenTabel;
        this.aantallen = new int[matenTabel.length];
    }

    /**
     * Deze methode voegt het verkochte aantal van een maat toe indien deze maat
     * in de tabel staat en het aantal positief is.
     *
     * @param maat   de kledingsmaat die in de matenTabel moet voorkomen.
     * @param aantal het aantal verkochte kledingsstukken.
     * @return is de wijziging succesvol doorgevoerd of niet.
     */
    public boolean ingaveVerkochteMaten(String maat, int aantal) {
        int indexOfMaat = -1;
        for (int i = 0; i < matenTabel.length; i++) {
            if (matenTabel[i].equals(maat)) {
                indexOfMaat = i;
            }
        }
        if (indexOfMaat == -1 || aantal <= 0) {
            return false;
        }
        aantallen[indexOfMaat] += aantal;
        return true;
    }

    public String geefPopulairsteMaat() {
        int populairsteAantal = 0;
        int index = -1;
        for (int i = 0; i < aantallen.length; i++) {
            if (aantallen[i] > populairsteAantal) {
                index = i;
                populairsteAantal = aantallen[i];
            }
        }
        if (index != -1) {
            return matenTabel[index];
        } else {
            return matenTabel[0];
        }
    }

    public String geefOverzichtVanDeMaten() {
        String outputString = "Verkoopsresultaten van artikel: " + BESCHRIJVING + "\n";
        for (int i = 0; i < matenTabel.length; i++) {
            outputString += matenTabel[i] + " :\t";
            for (int j = 0; j < aantallen[i]; j++) {
                outputString += "X";
            }
            outputString += "\n";
        }
        return outputString;
    }

}
