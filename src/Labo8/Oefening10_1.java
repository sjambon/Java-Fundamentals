package Labo8;

public class Oefening10_1 {
    public static void main(String[] args) {
        boolean m = true;
        boolean a = true;
        boolean j = true;
        boolean geval1;
        boolean geval2;
        boolean geval3;
        System.out.println("\t---------------------------------------------\n\t\twaarderingen\t\t\t uitspraken\n\t---------------------------------------------");
        System.out.println("\tm\t\ta\t\tj\t\t1\t\t2\t\t3");
        for (int i = 1; i <= 8; i++) {
            if (i > 4) {
                m = false;
            }
            if ((i > 2 && i < 5) || i > 6) {
                a = false;
            }
            if (i % 2 == 0) {
                j = false;
            }
            geval1 = ((m || a) == j);
            geval2 = (!m == a);
            geval3 = (a != j);
            System.out.println("\t" + m + "\t" + a + "\t" + j + "\t" + geval1 + "\t" + geval2 + "\t" + geval3);
            m = true;
            a = true;
            j = true;
        }
    }
}

