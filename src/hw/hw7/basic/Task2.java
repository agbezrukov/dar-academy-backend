package hw.hw7.basic;
/*
2. Напишите метод для вычисления среднего значения трех чисел.
Дано:
Первое число: 25
Второе число: 45
Третье число: 65
Ожидаемый результат:
Среднее значение 45,0
 */

public class Task2 {
    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 45;
        int num3 = 65;

        double averageNumber = averageCalculationNumber(num1, num2, num3);
        System.out.println(averageNumber);
    }

    private static double averageCalculationNumber(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}
