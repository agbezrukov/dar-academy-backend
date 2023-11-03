package hw.hw7.basic;

/*
5. Дано целое неотрицательное число. Напишите метод для подсчета количества цифр числа, имеющих значение 2.
Дано:
1254212
Ожидаемый результат:
3
 */
public class Task5 {
    public static void main(String[] args) {
        int num1 = 1254212;

        int sumCount = countNumberDigits(num1);

        System.out.println(sumCount);
    }

    private static int countNumberDigits(int num1) {

        int count = 0;

        for (int i = 0; i < num1; num1 /= 10) {
            if (num1 % 10 == 2) {
                count++;
            }
        }

        return count;
    }
}
