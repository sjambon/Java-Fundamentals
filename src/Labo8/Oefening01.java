package Labo8;

public class Oefening01 {
    public static void main(String[] args) {
        int s = 0, t = 0, i = 0, j;
        while (i < 5) {
            s += i;
            System.out.printf("S is %s\n", s);
            i++;
            j = i;
            while (j > 0) {
                t = t * (i - j + 1);
                j--;
            }
            System.out.printf("T is %s\n", t);
        }
        s *= t;
        System.out.printf("S is %s\n", s);
    }
}