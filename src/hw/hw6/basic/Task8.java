package hw.hw6.basic;

/*
8. Дан массив целых значений. Напишите программу для формирования наибольшего числа из заданного массива целых неотрицательных чисел.

Дано:
[1, 2, 3, 0, 4, 6]
Вывод:
643210
 */
public class Task8 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 0, 4, 6};

        int k = -1;
        String result = "";

        for (int i = 0; i < array.length; i++) {
            int max = -1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] >= 0 && array[j] > max) {
                    max = array[j];
                    k = j;
                }
            }
            array[k] = -1;
            result += max;
        }

        System.out.println(result);
    }
}
