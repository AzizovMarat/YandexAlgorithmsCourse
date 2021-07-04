package Sapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sapper {
    public static void main(String[] args) throws IOException {
        int[][] field;
        int[][] mines;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] temp = reader.readLine().split(" ");
            field = new int[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])];
            mines = new int[Integer.parseInt(temp[2])][2];
            for (int i = 0; i < mines.length; i++) {
                temp = reader.readLine().split(" ");
                mines[i][0] = Integer.parseInt(temp[0]) - 1;
                mines[i][1] = Integer.parseInt(temp[1]) - 1;
            }
        }
        drawField(field, mines);
    }

    public static void drawField(int[][] field, int[][] mines) {
        for (int i = 0; i < mines.length; i++) {
            int row = mines[i][0];
            int column = mines[i][1];
            field[row][column] = -1;
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != -1) {
                    System.out.print(getMines(field, i, j) + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static int getMines(int[][] field, int row, int column) {
        int mines = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = column - 1; j <= column + 1; j++) {
                if (i < 0 || i >= field.length) {
                    continue;
                }
                if (j < 0 || j >= field[0].length) {
                    continue;
                }
                if (i == row && j == column) {
                    continue;
                }
                if (field[i][j] == -1) mines++;
            }
        }
        return mines;
    }
}