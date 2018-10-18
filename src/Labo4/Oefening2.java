package Labo4;

/**
 * Dit programma geeft een willekeurig getal terug tussen 50 en 150
 * @author Steven Jambon
 * @version 15 oct 2018
 */

public class Oefening2 {
    public static void main(String[] args) {
        int random = randomWithRange();
        System.out.printf("Willekeurig getal tussen 50 en 150: %d%n", random);
    }

    private static int randomWithRange() {
        int range = (150 - 50) + 1;
        return (int)(Math.random() * range) + 50;
    }
}
