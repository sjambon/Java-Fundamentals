package Labo8;

public class Oefening10_2 {
    public static void main(String[] args) {
        GevallenOnderzoek gevallenOnderzoek = new GevallenOnderzoek(true, true, true);
        System.out.println("\t---------------------------------------------\n\t\twaarderingen\t\t\t uitspraken\n\t---------------------------------------------");
        System.out.println("\tm\t\ta\t\tj\t\t1\t\t2\t\t3");
        System.out.println(gevallenOnderzoek.toString());
        gevallenOnderzoek.setJ(false);
        System.out.println(gevallenOnderzoek.toString());
        gevallenOnderzoek.setA(false);
        gevallenOnderzoek.setJ(true);
        System.out.println(gevallenOnderzoek.toString());
        gevallenOnderzoek.setM();
        gevallenOnderzoek.setA(true);
        System.out.println(gevallenOnderzoek.toString());
        gevallenOnderzoek.setJ(false);
        System.out.println(gevallenOnderzoek.toString());
        gevallenOnderzoek.setA(false);
        gevallenOnderzoek.setJ(true);
        System.out.println(gevallenOnderzoek.toString());
        gevallenOnderzoek.setJ(false);
        System.out.println(gevallenOnderzoek.toString());
    }

    private static class GevallenOnderzoek {
        boolean m, a, j, geval1, geval2, geval3;

        GevallenOnderzoek(boolean m, boolean a, boolean j) {
            this.m = m;
            this.a = a;
            this.j = j;
            this.geval1 = ((m || a) == j);
            this.geval2 = (!m == a);
            this.geval3 = (a != j);        }

        private void setM() {
            this.m = false;
        }
        private void setA(boolean newA) {
            this.a = newA;
        }
        private void setJ(boolean newJ) {
            this.j = newJ;
        }

        private void updateGevallen() {
            this.geval1 = ((m || a) == j);
            this.geval2 = (!m == a);
            this.geval3 = (a != j);
        }

        @Override
        public String toString() {
            this.updateGevallen();
            return "\t" + this.m + "\t" + this.a + "\t" + this.j + "\t" + this.geval1 + "\t" + this.geval2 + "\t" + this.geval3;
        }
    }
}
