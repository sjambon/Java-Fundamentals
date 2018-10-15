package Labo4;

/**
 * Dit programma geeft een willekeurig getal terug tussen 50 en 150
 * @author Steven Jambon
 * @version 15 oct 2018
 */

public class Oefening2 {
    public static void main(String[] args) {
        int random = randomWithRange(50, 150);
        System.out.println("Willekeurig getal tussen 50 en 150: " + random);
    }

    private static int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
