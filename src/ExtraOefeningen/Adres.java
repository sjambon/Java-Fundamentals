package ExtraOefeningen;

public class Adres {
    private String straat;
    private int nr;
    private int postcode;
    private String gemeente;

    Adres(String straat, int nr, int postcode, String gemeente) {
        this.straat = straat;
        this.nr = nr;
        this.postcode = postcode;
        this.gemeente = gemeente;
    }

    public String toString() {
        return String.format("%s %s\n%s %s", postcode, gemeente, straat, nr);
    }
}
