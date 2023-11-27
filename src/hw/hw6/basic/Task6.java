package hw.hw6.basic;
/*
Дан массив целых значений. Напишите программу для нахождения наибольшего и наименьшего элементов массива.
Дано:
[1, 3, -6, 23, 14, 2]

Вывод:
Минимальный элемент = -6
Максимальный элемент = 23
 */

public class Task6 {
    public static void main(String[] args) {

        int[] array = {1, 3, -6, 23, 14, 2};
        int maxNum = array[0];
        int minNum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
            if (minNum > array[i]) {
                minNum = array[i];
            }
        }

        System.out.println("Вывод:");
        System.out.println("Минимальный элемент = " + minNum);
        System.out.println("Максимальный элемент = " + maxNum);
    }
}
