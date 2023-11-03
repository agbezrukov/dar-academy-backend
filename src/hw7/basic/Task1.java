package hw7.basic;

/*
1. Напишите метод для нахождения наименьшего числа среди трех чисел.
Дано:
Первое число: 25
Второе число: 37
Третье число: 29
Ожидаемый результат:
Наименьшее значение: 25
 */
public class Task1 {
    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 37;
        int num3 = 29;

        int smallNumber = findSmallNumber(num1, num2, num3);

        System.out.println(smallNumber);
    }

    private static int findSmallNumber(int num1, int num2, int num3) {

        int num;

        if (num1 < num2 && num1 < num3) {
            num = num1;
        } else if (num2 < num1 && num2 < num3) {
            num = num2;
        } else {
            num = num3;
        }

        return num;
    }
}
