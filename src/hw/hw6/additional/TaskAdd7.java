package hw.hw6.additional;
//Напишите программу, которая поворачивает матрицу на 90 градусов по часовой стрелке.

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class TaskAdd7 {
    public static void main(String[] args) {

        final int LENGTH = 10;
        int[][] source = new int[LENGTH][LENGTH]; // создание матрицы

        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (i == j) {
                    source[i][j] = ThreadLocalRandom.current().nextInt(-LENGTH, LENGTH);
                } else if (i < j) {
                    int randomValue = ThreadLocalRandom.current().nextInt(-LENGTH, LENGTH);
                    source[i][j] = randomValue;
                    source[j][i] = randomValue;
                }
            }
        }

        for (int[] row : source) {
            System.out.println(Arrays.toString(row));
        }

        //решение
        int rows = source.length;
        int columns = source[0].length;
        int[][] rotatedSource = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rotatedSource[j][rows - 1 - i] = source[i][j];
            }
        }
        System.out.println();
        for (int[] row : rotatedSource) {
            System.out.println(Arrays.toString(row));
        }
    }
}
