package Labo10.Oefening05;

import java.util.ArrayList;

/**
 * @author Steven Jambon
 * @version December 2018
 */

public class MeetGegevens {

    private int[] array;

    /**
     * constructor methode
     * @param array array die de meetgegevens bevat.
     */
    MeetGegevens(int[] array) {
        this.array = array;
    }

    /**
     * Deze methode controlleerd of alle elementen in de array verschillend zijn.
     */

    public boolean zijnAlleElementenOnderlingVerschillend() {
        ArrayList<Integer> origineel = new ArrayList<>();
        for (int item : array) {
            if (origineel.contains(item)) {
                return false;
            } else {
                origineel.add(item);
            }
        }
        return true;
    }

    /**
     * Deze methode bepaald het kleinste positieve verschil in de array.
     * @return het kleinste positief verschil.
     */
    int bepaalKleinstePositiefVerschil() {
        int verschil = Integer.MAX_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (Math.abs((array[i] - array[j])) < verschil) {
                    verschil = Math.abs((array[i] - array[j]));
                }
            }
        }
        return verschil;
    }
}