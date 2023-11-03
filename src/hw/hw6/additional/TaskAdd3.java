package hw.hw6.additional;

import java.util.Arrays;

/*
Напишите программу, которая транспонирует заданную матрицу (меняет строки на столбцы и наоборот).
 */
public class TaskAdd3 {
    public static void main(String[] args) {

        int[][] array = {{4, 2, 1}, {2, 7, 2}};
        int rows = array.length;
        int columns = array[0].length;

        int[][] modifiedArray = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                modifiedArray[j][i] = array[i][j];
            }
        }

        for (int[] i : modifiedArray) {
            System.out.println(Arrays.toString(i));
        }
    }
}
