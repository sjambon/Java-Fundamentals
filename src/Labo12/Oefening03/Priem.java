package Labo12.Oefening03;

public class Priem {
    public static Boolean isPriem(int getal) {
        for(int i = 2; i <= getal/2; ++i)
        {
            // condition for nonprime number
            if(getal % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static int aantalPriem(int min, int max) {
        int aantal = 0;
        for (int i = min; i <= max; i++) {
            if (isPriem(i)) {
                aantal++;
            }
        }
        return aantal;
    }

    public static int[] geefPriem(int min, int max) {
        int[] priemgetallen = new int[aantalPriem(min, max)];
        int plaats = 0;
        for (int i = min; i <= max; i++ ) {
            if (isPriem(i)) {
                priemgetallen[plaats] = i;
                plaats++;
            }
        }
        return priemgetallen;
    }
}
