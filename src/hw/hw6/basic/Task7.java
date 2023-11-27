package hw.hw6.basic;

/*
7. Дан массив целых значений. Напишите программу для нахождения наименьшего и второго наименьшего элементов заданного массива.

Дано:
[1, 3, -6, 23, 14, 2]
Вывод:
Наименьший элемент = -6
Второй наименьший элемент = 1
 */
public class Task7 {
    public static void main(String[] args) {

        int[] array = {1, 3, -6, 23, 14, 2};
        int minNum1 = array[0];
        int minNum2 = array[0];

        for (int i = 0; i < array.length; i++) {
            if (minNum1 > array[i]) {
                minNum2 = minNum1;
                minNum1 = array[i];
            }
        }

        System.out.println("Вывод:");
        System.out.println("Наименьший элемент = " + minNum1);
        System.out.println("Второй наименьший элемент = " + minNum2);
    }
}
