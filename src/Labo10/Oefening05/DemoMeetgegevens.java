package Labo10.Oefening05;

import Miscellaneous.RandomArray;

import java.util.Arrays;

/**
 * Klasse die de MeetGegevens klasse uitvoert.
 *
 * @author Steven Jambon
 * @version December 2018
 */

public class DemoMeetgegevens {

    /**
     * Hoofdmethode
     * @param args
     * @see MeetGegevens#bepaalKleinstePositiefVerschil()
     * @see MeetGegevens#zijnAlleElementenOnderlingVerschillend()
     */
    public static void main(String[] args) {
        int[] array = RandomArray.createIntArray(10, 100);
        MeetGegevens meetgegevens = new MeetGegevens(array);
        boolean verschillend = meetgegevens.zijnAlleElementenOnderlingVerschillend();
        int kleinste = meetgegevens.bepaalKleinstePositiefVerschil();
        System.out.println(Arrays.toString(array));
        System.out.printf("Zijn alle onderlinge elementen van de array verschillen?: %s \nHet kleinte positieve verschil van de array is: %s", verschillend, kleinste);
    }
}
