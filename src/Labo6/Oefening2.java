package Labo6;

public class Oefening2 {

    public static void main(String[] args) {
        int resultaat;
        for(int i = 0; i <= 10; i++) {
            resultaat = i * i * i;
            System.out.printf("De derde macht van %s is %s\n", i, resultaat);
        }
    }
}