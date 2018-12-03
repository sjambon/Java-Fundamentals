package Labo10.Oefening0102;

public class Rechthoek {
    private int x;
    private int y;
    private int breedte;
    private int lengte;

    public Rechthoek(int x, int y, int breedte, int lengte) {
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.lengte = lengte;
    }

    public boolean isVierkant() {
        return lengte == breedte;
    }

    public int berekenOpp() {
        int oppervlakte = lengte * breedte;
        return oppervlakte;
    }

    public boolean isIn(int xPos, int yPos) {
        return x + breedte <= xPos && y + lengte <= yPos && x >= xPos && y >= yPos;
    }
}
