package Labo10.Oefening0102;

import java.util.Scanner;

public class DemoRechthoek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef de x-positie van de rechthoek:");
        int x = sc.nextInt();
        System.out.println("Geef de y-positie van de rechthoek:");
        int y = sc.nextInt();
        System.out.println("Geef de breedte van de rechthoek:");
        int breedte = sc.nextInt();
        System.out.println("Geef de lengte van de rechtoek:");
        int lengte = sc.nextInt();
        Rechthoek rechthoek = new Rechthoek(x, y, breedte, lengte);
        if (rechthoek.isVierkant()) {
            System.out.println("De rechthoek is een vierkant.");
        } else {
            System.out.println("De rechthoek is geen vierkant.");
        }
        System.out.printf("De oppervlakte van de rechtoek is: %s\n", rechthoek.berekenOpp());
        System.out.printf("De omtrek van de rechtoek is: %s\n", rechthoek.berekenOmtrek());
        int xPos;
        int yPos;
        do {
            System.out.println("Geef de x-positie waarvan je wilt weten of deze in de rechthoek ligt:");
            xPos = sc.nextInt();
            System.out.println("Geef de y-positie waarvan je wilt weten of deze in de rechthoek ligt:");
            yPos = sc.nextInt();
            if (rechthoek.isIn(xPos, yPos)) {
                System.out.printf("Het punt [%s,%s] ligt in de rechthoek.\n", xPos, yPos);
            } else {
                System.out.printf("Het punt [%s,%s] ligt niet in de rechthoek.\n", xPos, yPos);
            }
        }while (rechthoek.isIn(xPos, yPos));
    }
}
