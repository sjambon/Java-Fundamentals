package Labo6;

public class Oefening01 {

    public static void main(String args[]){
        double resultaat;
        for(int i = -20; i <= 50; i+= 5) {
            resultaat = i * 1.8 + 32;
            System.out.printf("Bij %s graden Celcius is het %s graden Farenheit\n", i, resultaat);
        }
    }
}
