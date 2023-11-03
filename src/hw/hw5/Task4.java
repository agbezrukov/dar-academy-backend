package hw.hw5;

/*
4. Дано целое положительное число. Напишите программу, которая выводит это число в обратном порядке.
Например, если дано число 12345, то вывод будет следующим: 54321.
 */
public class Task4 {
    public static void main(String[] args) {
        int num = 12345;
        int num2 = 0;

        for (int i = num; i > 0; i /= 10) {
            num2 *= 10;
            num2 += i % 10;
        }

        System.out.println(num2);
    }
}
