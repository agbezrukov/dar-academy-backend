package hw.hw7.basic;

/*
7. Напишите метод для вычисления суммы цифр целого числа.
Дано:
252
Ожидаемый результат:
Сумма = 9
 */
public class Task8 {
    public static void main(String[] args) {
        int num = 252;

        int sum = allSumNumber(num);

        System.out.println(sum);
    }

    private static int allSumNumber(int num) {

        int sum = 0;

        for (int i = 0; i < num; num /= 10) {
            sum += num % 10;
        }

        return sum;
    }
}
