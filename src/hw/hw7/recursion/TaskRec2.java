package hw.hw7.recursion;

import java.util.Scanner;

/*
2) Напишите рекурсивную функцию для вычисления N-го числа Фибоначчи.
N-ое число Фибоначчи определяется как сумма двух предыдущих чисел Фибоначчи.

 */
public class TaskRec2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("N-ное число Фибоначчи: " + fibonacci(scanner.nextInt()));
    }

    private static int fibonacci(int n) {
        if (n ==0 || n==1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
