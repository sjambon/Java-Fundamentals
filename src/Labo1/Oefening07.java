package Labo1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Deze klasse print een Error
 * op het scherm
 *
 * @author Steven Jambon
 * @version 24 sept 2018
 */

public class Oefening07 {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        System.out.println("De opgegeven datum is: " + dateFormat.format(date));

    }
}