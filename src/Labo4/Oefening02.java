package Labo4;

/**
 * Dit programma geeft een willekeurig getal terug tussen 50 en 150
 *
 * @author Steven Jambon
 * @version 15 oct 2018
 */

public class Oefening02 {
    public static void main(String[] args) {
        int range = (150 - 50) + 1;
        int random = (int) ((Math.random() * range) + 50);
        System.out.printf("Willekeurig getal tussen 50 en 150: %d%n", random);
    }
}