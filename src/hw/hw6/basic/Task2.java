package hw.hw6.basic;
/*
2. Дан массив целых значений. Напишите программу для поиска дубликатов значений.

Дано:
[1, 3, 4, 1, 5, 5]
Вывод:
Дубликаты = 1, 5
 */
public class Task2 {
    public static void main(String[] args) {
        int [] array = {1, 3, 4, 1, 5, 5};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}
