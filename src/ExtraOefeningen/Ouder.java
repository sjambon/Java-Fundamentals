package ExtraOefeningen;

public class Ouder extends Persoon {

    private double inkomen;

    Ouder(String naam, String voornaam, Geboortedatum geboortedatum, Geslacht geslacht, double inkomen) throws Exception {
        super(naam, voornaam, geboortedatum, geslacht);
        if (inkomen >= 0.0) {
            this.inkomen = inkomen;
        } else {
            throw new Exception("Ongeldig Inkomen!");
        }
    }

    public double getInkomen() {
        return inkomen;
    }

    public String toString() {
        return String.format("%s %s %s (%s) %s; inkomen = %s", getVoornaam(), getNaam(), getGeboortedatum(), getLeeftijd(), getGeslacht(), inkomen);
    }

    @Override
    public int compareTo(Persoon o) {
        return (getLeeftijd() - o.getLeeftijd());
    }
}
