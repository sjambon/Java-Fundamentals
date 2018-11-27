package Labo10.Oefening2;

import java.util.ArrayList;

public class MeetGegevens {

    private int[] array;

    MeetGegevens(int[] array) {
        this.array = array;
    }

    boolean zijnAlleElementenOnderlingVerschillend() {
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