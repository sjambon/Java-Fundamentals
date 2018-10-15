package Labo3;

/**
 * Dit programma print een lijst af.
 *
 * @author Steven Jambon
 * @version 8 oct 2018
 */

public class Oefening11 {
    public static void main(String[] args) {
        boolean m = true;
        boolean a = true;
        boolean j = true;
        boolean geval1 = (m == true || a == true ? j == true : j == false);
        boolean geval2 = (m == false ? a == true : a == false);
        boolean geval3 = (a == true ? j == false : j == true);
        System.out.println("\t---------------------------------------------\n\twaarderingen\t\t\t uitspraken\n\t---------------------------------------------");
        System.out.println("\tm\ta\tj\t1\t2\t3");
        System.out.println("\t" + m + "\t" + a + "\t" + j + "\t" + geval1 + "\t" + geval2 + "\t" + geval3);
        j = false;
        geval1 = (m == true || a == true ? j == true : j == false);
        geval2 = (m == false ? a == true : a == false);
        geval3 = (a == true ? j == false : j == true);
        System.out.println("\t" + m + "\t" + a + "\t" + j + "\t" + geval1 + "\t" + geval2 + "\t" + geval3);
        a = false;
        j = true;
        geval1 = (m == true || a == true ? j == true : j == false);
        geval2 = (m == false ? a == true : a == false);
        geval3 = (a == true ? j == false : j == true);
        System.out.println("\t" + m + "\t" + a + "\t" + j + "\t" + geval1 + "\t" + geval2 + "\t" + geval3);
        m = false;
        a = true;
        geval1 = (m == true || a == true ? j == true : j == false);
        geval2 = (m == false ? a == true : a == false);
        geval3 = (a == true ? j == false : j == true);
        System.out.println("\t" + m + "\t" + a + "\t" + j + "\t" + geval1 + "\t" + geval2 + "\t" + geval3);
        j = false;
        geval1 = (m == true || a == true ? j == true : j == false);
        geval2 = (m == false ? a == true : a == false);
        geval3 = (a == true ? j == false : j == true);
        System.out.println("\t" + m + "\t" + a + "\t" + j + "\t" + geval1 + "\t" + geval2 + "\t" + geval3);
        a = false;
        j = true;
        geval1 = (m == true || a == true ? j == true : j == false);
        geval2 = (m == false ? a == true : a == false);
        geval3 = (a == true ? j == false : j == true);
        System.out.println("\t" + m + "\t" + a + "\t" + j + "\t" + geval1 + "\t" + geval2 + "\t" + geval3);
        j = false;
        geval1 = (m == true || a == true ? j == true : j == false);
        geval2 = (m == false ? a == true : a == false);
        geval3 = (a == true ? j == false : j == true);
        System.out.println("\t" + m + "\t" + a + "\t" + j + "\t" + geval1 + "\t" + geval2 + "\t" + geval3);

    }
}