package hw.hw6.additional;
/*
Напишите программу, которая проверяет, является ли заданная матрица симметричной (относительно главной диагонали).
 */
import java.util.concurrent.ThreadLocalRandom;

public class TaskAdd6 {
    public static void main(String[] args) {

        final int LENGTH = 10;
        int[][] source = new int[LENGTH][LENGTH]; // создал матрицу, взяв с первой же ссылки ))

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


        int rows = source.length; // решение
        int columns = source[0].length;

        boolean isSymmetricMatrix = true;

        if (rows != columns) {
            isSymmetricMatrix = false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                if (source[i][j] != source[j][i]) {
                    isSymmetricMatrix = false;
                }
            }
        }

        System.out.println(isSymmetricMatrix);
    }
}
