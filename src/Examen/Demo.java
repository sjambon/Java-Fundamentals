/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

public class Demo {
    public static void main(String[] args) {
        String[] matenTabel = {"32", "33", "34", "35", "36", "37", "38", "39"};
        Artikel artikel = new Artikel("Donkergrijze Lage Sportieve Sneaker Adidas VL Court 2.0", matenTabel);
        for (int i = 0; i < 10; i++) {
            String maat = matenTabel[(int) (Math.random() * 8)];
            int aantal = (int) (Math.random() * 10);
            System.out.println("Maat: " + maat + "\tAantal: " + aantal + "\t" + artikel.ingaveVerkochteMaten(maat, aantal));
        }
        System.out.println("Maat: " + "XL" + "\tAantal: " + "5" + "\t" + artikel.ingaveVerkochteMaten("XL", 5));
        System.out.println("Maat: " + "35" + "\tAantal: " + "-3" + "\t" + artikel.ingaveVerkochteMaten("35", -3) + "\n");
        System.out.println(artikel.geefOverzichtVanDeMaten());
        System.out.println("De populairste maat van dit artikel is maat " + artikel.geefPopulairsteMaat());
    }
}
