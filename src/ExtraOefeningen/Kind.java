package ExtraOefeningen;

public class Kind extends Persoon {

    private double zakgeld;

    Kind(String naam, String voornaam, Geboortedatum geboortedatum, Geslacht geslacht) {
        super(naam, voornaam, geboortedatum, geslacht);
        this.zakgeld = 0.0;
    }


    public void setZakgeld(double niewZakgeld) {
        this.zakgeld = niewZakgeld;
    }

    public double getZakgeld() {
        return zakgeld;
    }

    public String toString() {
        return String.format("%s %s %s (%s) %s; zakgeld = %s", getVoornaam(), getNaam(), getGeboortedatum(), getLeeftijd(), getGeslacht(), zakgeld);

    }

    @Override
    public int compareTo(Persoon o) {
        return (getLeeftijd() - o.getLeeftijd());
    }
}
