package Labo10.Oefening2;

import Miscellaneous.RandomArray;

import java.util.Arrays;

public class DemoMeetgegevens {

    public static void main(String[] args) {
        int[] array = RandomArray.createIntArray(10, 100);
        MeetGegevens meetgegevens = new MeetGegevens(array);
        boolean verschillend = meetgegevens.zijnAlleElementenOnderlingVerschillend();
        int kleinste = meetgegevens.bepaalKleinstePositiefVerschil();
        System.out.println(Arrays.toString(array));
        System.out.printf("Zijn alle onderlinge elementen van de array verschillen?: %s \nHet kleinte positieve verschil van de array is: %s", verschillend, kleinste);
    }
}
