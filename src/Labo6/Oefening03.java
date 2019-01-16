package Labo6;

public class Oefening03 {

    public static void main(String[] args) {
        for (double i = -6.01; i <= 9.01; i += 0.01) {
            i = Math.round(i * 100) / 100.0;
            System.out.println(i);
        }
    }
}
