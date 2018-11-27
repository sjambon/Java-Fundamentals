package Labo10.Oefening4tot6;

public class Matrix {
    private int[][] matrix;

    Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public String toString() {
        StringBuilder outputString = new StringBuilder();
        for (int rij = 0; rij < matrix.length; rij++) {
            for (int kolom = 0; kolom < matrix[rij].length; kolom++) {
                outputString.append(matrix[rij][kolom]).append(" ");
            }
            outputString.append("\n");
        }
        return outputString.toString();
    }

    public int[] rijSommen() {
        int[] resultaat = new int[matrix.length];
        int counter = 0;
        for (int rij = 0; rij < matrix.length; rij++) {
            int som = 0;
            for (int kolom = 0; kolom < matrix[rij].length; kolom++) {
                som += matrix[rij][kolom];
            }
            resultaat[counter] = som;
            counter++;
        }
        return resultaat;
    }
    public int[] kolomSommen() {
        int[] resultaat = new int[matrix[0].length];
        for (int rij = 0; rij < matrix.length; rij++) {
            int counter = 0;
            for (int kolom = 0; kolom < matrix[rij].length; kolom++) {
                resultaat[counter] += matrix[rij][kolom];
                counter++;
            }
        }
        return resultaat;
    }

    public void aftoppen(int n) {
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

