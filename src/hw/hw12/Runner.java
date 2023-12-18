package hw.hw12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        mathOperations(5, 1);

//        printOddNumbers();

//        swapWithoutThirdVariable(10, 5);

//        System.out.println("Введите первое число");
//        int num1 = sc.nextInt();
//        System.out.println("Введите второе число");
//        int num2 = sc.nextInt();
//        System.out.println("Введите третье число");
//        int num3 = sc.nextInt();
//        findMaxNumber(num1, num2, num3);

//        checkNumberIsPositive(4);

//        System.out.println(replaceCharacters("aregano-baregano"));

//        int[] array = {1, 2, 3, 4, 5};
//        System.out.println(sumArrayValues(array));

        int[] array = {111, -2, 343, 49, 5};
        System.out.println(findSecondLargest(array));
    }

    //Метод для вывода суммы, умножения, вычитания, деления и остатка двух чисел
    private static void mathOperations(int a, int b) {
        System.out.println("Сумма: " + (a + b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Вычитание: " + (a - b));

        try {
            System.out.println("Деление: " + (a / b));
            System.out.println("Остаток от деления: " + (a % b));
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 невозможно.");
        }
    }

    //Напишите метод для вывода нечетных чисел от 1 до 20
    private static void printOddNumbers() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }

    //Напишите метод, чтобы поменять местами две переменные (без третьей переменной)
    public static void swapWithoutThirdVariable(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println();
        System.out.println("a = " + a + " " + "b = " + b);
    }

    //Напишите метод, которая принимает от пользователя три числа и выводит наибольшее из них
    private static void findMaxNumber(int a, int b, int c) {
        System.out.println("Наибольшее число " + Math.max(Math.max(a, b), c));
    }

    //Напишите метод для проверки того, является ли число положительным или отрицательным
    public static void checkNumberIsPositive(int num){
        if (num > 0) {
            System.out.println(num + " является положительным числом.");
        } else if (num < 0) {
            System.out.println(num + " является отрицательным числом.");
        } else {
            System.out.println(num + " является нулем.");
        }
    }

    //Напишите метод для замены всех символов 'a' на символы 'b'
    public static String replaceCharacters(String str) {
        return str.replace('a', 'b');
    }

    //Напишите метод для суммирования значений массива
    public static int sumArrayValues(int[] array) {
        return Arrays.stream(array).sum();
    }

    //Напишите метод для нахождения второго по величине числа из массива
    public static int findSecondLargest(int[] array){
        return Arrays.stream(array)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);
    }

}
