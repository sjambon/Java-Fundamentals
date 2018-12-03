package Labo10.Oefening03;

import java.util.Scanner;

public class TestDobbelen {
    private static Dobbelsteen dobbelsteen;
    public TestDobbelen(int minimumOgen, int maximumOgen) {
        dobbelsteen = new Dobbelsteen(minimumOgen, maximumOgen);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                System.out.printf("Nieuwe worp = %s", gegooideOgen);
            } while (gegooideOgen != ogen);
            System.out.printf("In %s pogingen werd een %s gedobbeld.", counter, ogen);
        }
    }
}
