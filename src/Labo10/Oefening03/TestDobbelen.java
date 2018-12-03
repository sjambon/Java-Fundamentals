package Labo10.Oefening03;

import java.util.Scanner;

public class TestDobbelen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef het minimum aantal ogen:");
        int minOgen = sc.nextInt();
        System.out.println("Geef het maximum aantal ogen: ");
        int maxOgen = sc.nextInt();
        Dobbelsteen dobbelsteen = new Dobbelsteen(minOgen, maxOgen);
        System.out.printf("Hoeveel ogen wil je werpen? [%s,%s]", dobbelsteen.minimumOgen, dobbelsteen.maximumOgen);
        int ogen = sc.nextInt();
        if (ogen < dobbelsteen.minimumOgen || ogen > dobbelsteen.maximumOgen) {
            System.out.println("ERROR: het aantal ogen is niet mogelijk om te werpen!");
        } else {
            int gegooideOgen;
            int counter = 0;
            do {
                gegooideOgen = dobbelsteen.gooi();
                counter++;
                System.out.printf("Nieuwe worp = %s\n", gegooideOgen);
            } while (gegooideOgen != ogen);
            System.out.printf("In %s pogingen werd een %s gedobbeld.", counter, ogen);
        }
    }
}
