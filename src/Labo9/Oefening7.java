package Labo9;

import java.util.Random;

public class Oefening7 {

    public static void main(String[] args) {
        double[] array = new double[72];
        boolean[] tienProcentArray = new boolean[72];
        double count = 0;

        Random randomGenerator = new Random();
        StringBuilder lijn = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextDouble() * 100.0;
        }
        for (double item : array) {
            count += item;
        }
        count /= 72.0;
        System.out.printf("Uit een array van 72 reële getallen zijn we een gemiddelde van %s bekomen.\n", count);

        double plus10Procent = count * 1.10;
        double min10Procent = count * 0.90;
        for (int i = 0; i < array.length; i++) {
            tienProcentArray[i] = array[i] >= min10Procent && array[i] <= plus10Procent;
        }
        for (int i = 0; i < tienProcentArray.length; i++) {
            boolean item = tienProcentArray[i];
            if (item) {
                lijn.append(i).append(",");
            }
        }
        lijn.deleteCharAt(lijn.lastIndexOf(","));
        System.out.printf("Op de uren '%s' zit de waarde binnen de 10 procent rond het gemiddelde.", lijn.toString());
    }
}
