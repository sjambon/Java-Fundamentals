package Labo9;

import Miscellaneous.RandomArray;
import java.util.ArrayList;
import java.util.Arrays;

public class Oefening10 {

    public static void main(String[] args) {
        int[] array = RandomArray.createIntArray(10, 100);
        Meetgegevens meetgegevens = new Meetgegevens(array);
        boolean verschillend = meetgegevens.zijnAlleElementenOnderlingVerschillend();
        int kleinste = meetgegevens.bepaalKleinstePositiefVerschil();
        System.out.println(Arrays.toString(array));
        System.out.printf("Zijn alle onderlinge elementen van de array verschillen?: %s \nHet kleinte positieve verschil van de array is: %s", verschillend, kleinste);
    }

    public static class Meetgegevens {

        int[] array;

        Meetgegevens(int[] array) {
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
            int diff = Integer.MAX_VALUE;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (Math.abs((array[i] - array[j])) < diff) {
                        diff = Math.abs((array[i] - array[j]));
                    }
                }
            }
            return diff;
        }
    }
}
