package hw6.basic;

import java.util.Arrays;

/*
5. Даны массив целых значений и целые числа n, m. Напишите программу для нахождения подмассива между индексами n и m.

1)
Дано:
[34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7]
int n = 3
int m = 8
Вывод:
[30, 25, 40, 32, 31, 35]

2)
Дано:
[1, 3, -6, 23, 14, 2]
int n = 1
int m = 3
Вывод:
[3, -6, 23]
 */
public class Task5 {

    public static void main(String[] args) {
        int n = 1;
        int m = 3;
        int[] array1 = {1, 3, -6, 23, 14, 2};
        int[] array2 = new int[m - n + 1];

        for (int i = n, j = 0; i <= m; i++, j++) {
            array2[j] = array1[i];
        }

        System.out.println("Вывод:");
        System.out.println(Arrays.toString(array2));

    }
}

