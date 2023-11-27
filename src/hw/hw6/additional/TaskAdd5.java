package hw.hw6.additional;

import java.util.Arrays;

/*
Напишите программу, которая сортирует строки в двумерном массиве в порядке возрастания.
 */
public class TaskAdd5 {
    public static void main(String[] args) {

        int[][] array = {{4, 2, 1}, {2, 7, 2}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length - 1; j++) {
                for (int k = 0; k < array[0].length - j - 1; k++) {
                    if (array[i][k] > array[i][k + 1]) {
                        int temp = array[i][k];
                        array[i][k] = array[i][k + 1];
                        array[i][k + 1] = temp;
                    }
                }
            }
        }

        for (int[] a : array) {
            System.out.println(Arrays.toString(a));
        }
    }
}
