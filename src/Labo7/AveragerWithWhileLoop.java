package Labo7;

import java.util.Scanner;

public class AveragerWithWhileLoop {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program computes the average of a list of (nonnegative) exam scores.");
        System.out.println();
        System.out.println("Enter all the scores to be averaged.\nEnter a negative number after you have entered all the scores.");

        double sum = 0;
        int numberOfStudents = 0;
        double next = 0;

        while (next >= 0) {
            sum += next;
            numberOfStudents++;
            System.out.print("Enter a score:");
            next = keyboard.nextDouble();
        }
        if (numberOfStudents > 0) {
            System.out.println("The average is " + (sum / numberOfStudents));
        } else {
            System.out.println("No scores to average.");
        }
    }
}
