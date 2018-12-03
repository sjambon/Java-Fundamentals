package Labo10.Oefening03;

import java.util.Random;

public class Dobbelsteen {
    public int minimumOgen;
    public int maximumOgen;
    private int laatsteWorp = 0;

    public Dobbelsteen(int minimumOgen, int maximumOgen) {
        this.minimumOgen = minimumOgen;
        this.maximumOgen = maximumOgen;
    }

    public Dobbelsteen() {
        this.minimumOgen = 1;
        this.maximumOgen = 6;
    }

    public int gooi() {
        Random random = new Random();
        laatsteWorp = random.nextInt((maximumOgen - minimumOgen)) + 1;
        return minimumOgen + laatsteWorp;
    }


}
