package Labo11.Oefening02030405;

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

    int[][] lokaleMaxima() {
        int[][] lokaalMaxima = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j - 1 >= 0 && i - 1 >= 0 && j + 1 < matrix[i].length && i + 1 < matrix.length) {
                    if (matrix[i][j] > matrix[i - 1][j - 1] && matrix[i][j] > matrix[i - 1][j] && matrix[i][j] > matrix[i - 1][j + 1] && matrix[i][j] > matrix[i][j - 1] && matrix[i][j] > matrix[i][j + 1] && matrix[i][j] > matrix[i][j + 1] && matrix[i][j] > matrix[i + 1][j - 1] && matrix[i][j] > matrix[i + 1][j] && matrix[i][j] > matrix[i + 1][j] && matrix[i][j] > matrix[i + 1][j + 1]) {
                        lokaalMaxima[i][j] = 1;
                    } else {
                        lokaalMaxima[i][j] = 0;
                    }
                } else lokaalMaxima[i][j] = 0;
            }
        }
        return lokaalMaxima;
    }
}