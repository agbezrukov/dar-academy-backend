package hw6.basic;
/*

11. Напишите программу, которая возвращает true, если двумерный массив является квадратным.
(!) Двумерный массив считается квадратным, если количество строк равно длине каждой строки. Можно предположить, что каждая строка двумерного массива имеет одинаковое количество индексов.

1)
Дано:
10 20 30
40 50 60
Вывод:
false

2)
Дано:
10 20
40 50
Вывод:
true
 */

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {

//        int [][] array = {{10,20,30},{40,50,60}};
        int[][] array = {{10, 20}, {40, 50}};
        boolean isSquare = false;
        int rows = array.length;
        int columns = array[0].length;

        if (rows == columns) {
            isSquare = true;
        }

        System.out.println(isSquare);
    }
}
