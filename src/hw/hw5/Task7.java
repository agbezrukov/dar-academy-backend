package hw.hw5;

/*
Даны два целых числа a и b. Напишите программу для вычисления суммы натуральных чисел в диапазоне от a до b.
 */
public class Task7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = 0;

        for (int i = a + 1; i < b; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
