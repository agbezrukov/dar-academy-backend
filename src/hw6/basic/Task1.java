package hw6.basic;
/*
Выполните следующие инструкции:
1. Дан массив чисел. Напишите программу для вычисления среднего значения элементов одномерного массива.

Дано:
[1, 3, 4, 1, 5, 5]
Вывод:
Среднее значение = 3.16666667
 */
public class Task1 {
    public static void main(String[] args) {

        int [] array = {1, 3, 4, 1, 5, 5};
        double sum =0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
        }
        System.out.println(sum / array.length);
    }
}
