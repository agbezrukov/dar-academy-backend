package hw.hw6.basic;

/*
3. Дан массив целых значений. Напишите программу для проверки, содержит ли массив определенное значение.

1)
Дано:
[1, 3, -6, 23, 14, 2]
int x = 23
Вывод:
True

2)
Дано:
[1, 3, -6, 23, 14, 2]
int x = 0
Вывод:
False
 */
public class Task3 {
    public static void main(String[] args) {

        int[] array = {1, 3, -6, 23, 14, 2};
        int x = 0;
        boolean isInteger = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                isInteger = true;
            }
        }

        System.out.println("Вывод:");
        System.out.println(isInteger);
    }
}
