package Labo10.Oefening040506;

public class Matrix {
    private int[][] matrix;

    Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public String toString() {
        StringBuilder outputString = new StringBuilder();
        for (int[] matrix1 : matrix) {
            for (int i : matrix1) {
                outputString.append(i).append(" ");
            }
            outputString.append("\n");
        }
        return outputString.toString();
    }

    int[] rijSommen() {
        int[] resultaat = new int[matrix.length];
        int counter = 0;
        for (int[] matrix1 : matrix) {
            int som = 0;
            for (int i : matrix1) {
                som += i;
            }
            resultaat[counter] = som;
            counter++;
        }
        return resultaat;
    }

    int[] kolomSommen() {
        int[] resultaat = new int[matrix[0].length];
        for (int[] matrix1 : matrix) {
            int counter = 0;
            for (int i : matrix1) {
                resultaat[counter] += i;
                counter++;
            }
        }
        return resultaat;
    }

    void aftoppen(int n) {
        for (int rij = 0; rij < matrix.length; rij++) {
            for (int kolom = 0; kolom < matrix[rij].length; kolom++) {
                if (matrix[rij][kolom] > n) {
                    matrix[rij][kolom] = n;
                } else if (matrix[rij][kolom] < -n) {
                    matrix[rij][kolom] = -n;
                }
            }
        }
    }
}