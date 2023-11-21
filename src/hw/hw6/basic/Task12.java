package hw.hw6.basic;

import java.util.Arrays;

/*
12. Дано целое число n. Напишите программу, которая возвращает двумерный массив, представляющий таблицу умножения. Число n определяет размер таблицы умножения.

Дано:

n = 5;

Вывод:

[1,2,3,4,5]
[2,4,6,8,10]
[3,6,9,12,15]
[4,8,12,16,20]
[5,10,15,20,25]
 */
public class Task12 {
    public static void main(String[] args) {

        int n = 5;
        int k = 1;
        int[][] array = new int[n][n];

        for (int i = 1; i <= n; i++) {
            int l = 1;
            for (int j = 1; j <= n; j++) {
                array[i - 1][j - 1] = k * l++;
            }
            k++;
        }

        for (int[] a : array) {
            System.out.println(Arrays.toString(a));
        }
    }
}
