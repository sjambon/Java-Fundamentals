package Labo8;

public class Oefening10 {
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
        gevallenOnderzoek.setM(false);
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
        boolean m;
        boolean a;
        boolean j;

        boolean geval1;
        boolean geval2;
        boolean geval3;

        GevallenOnderzoek(boolean m, boolean a, boolean j) {
            this.m = m;
            this.a = a;
            this.j = j;
            this.geval1 = ((m || a) == j);
            this.geval2 = (!m == a);
            this.geval3 = (a != j);        }

        private void setM(boolean newM) {
            this.m = newM;
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
