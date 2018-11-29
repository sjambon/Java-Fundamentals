package ExtraOefeningen;

public class Persoon implements Comparable<Persoon> {

    @Override
    public int compareTo(Persoon o) {
        return (getLeeftijd() - o.getLeeftijd());
    }

    private String naam;
    private String voornaam;
    private Geboortedatum geboortedatum;
    private Geslacht geslacht;

    Persoon(String naam, String voornaam, Geboortedatum geboortedatum, Geslacht geslacht) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.geboortedatum = geboortedatum;
        this.geslacht = geslacht;
    }

    public Geboortedatum getGeboortedatum() {
        return geboortedatum;
    }

    public Geslacht getGeslacht() {
        return geslacht;
    }

    public int getLeeftijd() {
        return geboortedatum.geefLeeftijd();
    }

    public String getNaam() {
        return naam;
    }

    public  String getVoornaam() {
        return voornaam;
    }

    public String toString() {
        return String.format("%s %s %s (%s) %s", voornaam, naam, geboortedatum.toString(), getLeeftijd(), getGeslacht());
    }
}
