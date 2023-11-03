package hw.hw6.additional;

/*
Напишите программу, которая находит максимальный и минимальный элементы в двумерном массиве.
 */
public class TaskAdd4 {
    public static void main(String[] args) {

        int[][] array = {{4, 2, 1}, {2, 7, 2}};

        int maxNum = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > maxNum) {
                    maxNum = array[i][j];
                }
            }
        }

        int minNum = maxNum;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (minNum > array[i][j]) {
                    minNum = array[i][j];
                }
            }
        }

        System.out.println("минимальный элемент " + minNum);
        System.out.println("максимальный элемент " + maxNum);
    }
}
