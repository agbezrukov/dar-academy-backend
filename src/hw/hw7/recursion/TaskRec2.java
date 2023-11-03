package hw.hw7.recursion;

/*
2) Напишите рекурсивную функцию для вычисления N-го числа Фибоначчи.
N-ое число Фибоначчи определяется как сумма двух предыдущих чисел Фибоначчи.

 */
public class TaskRec2 {
    public static void main(String[] args) {

        int n = 7;
        System.out.println("N-ное число Фибоначчи: " + fibonacci(n));
    }

    private static int fibonacci(int n) {

        int sum;

        if (n <= 0) {
            sum = 0;
        } else if (n == 1) {
            sum = 1;
        } else {
            sum = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return sum;
    }
}
