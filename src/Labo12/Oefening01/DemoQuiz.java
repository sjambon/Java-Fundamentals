package Labo12.Oefening01;

import java.util.Scanner;

public class DemoQuiz {

    public static void main(String[] args) {
        String[] vragen = new String[]{"Welk woord duidt aan dat een dier of plant zowel mannelijk als vrouwelijk is?", "Wat is de vierkantswortel van 900?", "Van welke twee elementen is water gemaakt?", "Wat is de heetste planeet in ons zonnestelsel?"};
        String[] antwoorden = new String[]{"Hermafrodiet", "Dertig", "Zuurstof en waterstof", "Venus"};
        Scanner sc = new Scanner(System.in);
        Quiz quiz = new Quiz(vragen, antwoorden);
        String antwoord = "";
        while (!antwoord.equals("STOP")) {
            String vraag = quiz.geefVraag();
            System.out.println("Beantwoord volgende vraag:\n" + vraag + "\nJe antwoord: ");
            antwoord = sc.nextLine();
            String correctOfFout = quiz.checkAntwoordVraag(vraag, antwoord) ? "juist !!" : "helaas fout !";
            System.out.println("Dit antwoord is: " + correctOfFout + "\nWelke vraag wil je toevoegen?");
            String nieuweVraag = sc.nextLine();
            System.out.println("Wat is het bijhorende antwoord?");
            String nieuwAntwoord = sc.nextLine();
            quiz.voegVraagAntwoordToe(nieuweVraag, nieuwAntwoord);
        }
    }
}