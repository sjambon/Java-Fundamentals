package Labo8;

public class Oefening1 {
    public static void main(String[] args) {
        int s = 0;
        int t = 0;
        int i = 0;
        int j;
        while(i < 5) {
            s += i;
            System.out.printf("S is %s", s);
            i++;
            j = i;
            while (j > 0) {
                t = t * (i - j + 1);
                j --;
            }
            System.out.printf("T is %s", t);
        }
        s *= t;
        System.out.printf("S is %s", s);
    }
}