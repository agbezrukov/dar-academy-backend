package hw.hw6.basic;

import java.util.Arrays;

/*
9. Дан двумерный массив целых значений. Напишите программу для печати массива после изменения строк и столбцов заданного двумерного массива.
1)
Дано:
00 01 02
10 20 30

10 11 12
40 50 60
Вывод:
После изменения строк и столбцов указанного массива
00 01
10 40

10 11
20 50

21 22
30 60
2)
Дано:
4 2 1
2 7 2
Вывод:
После изменения строк и столбцов указанного массива
4 2
2 7
1 2
 */
public class Task9 {
    public static void main(String[] args) {


//        int [][] array = {{10,20,30},{40,50,60}};
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
