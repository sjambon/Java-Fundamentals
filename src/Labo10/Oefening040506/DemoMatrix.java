package Labo10.Oefening040506;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("Duplicates")

public class DemoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef het aantal rijen:");
        int rijen = sc.nextInt();
        System.out.println("Geef het aantal kolommen:");
        int kolommen = sc.nextInt();
        int[][] matrix = new int[rijen][kolommen];
        for (int rij = 0; rij < rijen; rij++) {
            for (int kolom = 0; kolom < kolommen; kolom++) {
                System.out.printf("Geef het getal voor positie [%s,%s]:\n", rij + 1, kolom + 1);
                matrix[rij][kolom] = sc.nextInt();
            }
        }
        Matrix matrixKlasse = new Matrix(matrix);
        System.out.println(matrixKlasse.toString());
        System.out.println(Arrays.toString(matrixKlasse.rijSommen()));
        System.out.println(Arrays.toString(matrixKlasse.kolomSommen()));
        Matrix aftopMatrix = aftopMatrix();
        System.out.printf("Random gegenereerde matrix:\n%s", aftopMatrix);
        System.out.println(aftopMatrix.toString());
        aftopMatrix.aftoppen(100);
        System.out.println(aftopMatrix.toString());
    }

    private static Matrix aftopMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef het aantal rijen:");
        int rijen = sc.nextInt();
        System.out.println("Geef het aantal kolommen:");
        int kolommen = sc.nextInt();
        int[][] matrix = new int[rijen][kolommen];
        for (int rij = 0; rij < rijen; rij++) {
            for (int kolom = 0; kolom < kolommen; kolom++) {
                matrix[rij][kolom] = (int) (Math.random() * 1000.0 - 500.0);
            }
        }
        return new Matrix(matrix);
    }
}