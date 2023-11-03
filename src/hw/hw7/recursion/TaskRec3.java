package hw.hw7.recursion;

/*
 3) Напишите рекурсивную функцию для вычисления числа x в степени n, где n - неотрицательное целое число.

 */
public class TaskRec3 {

    public static void main(String[] args) {
        int x = 2;
        int n = 4;

        if (n < 0) {
            System.out.println("Степень должна быть неотрицательным числом.");
        } else {
            int result = recursiveCalculateNumberPower(x, n);
            System.out.println(x + " в степени " + n + " = " + result);
        }
    }

    public static int recursiveCalculateNumberPower(int x, int n) {

        if (n == 0) {
            return 1;
        } else {
            return x * recursiveCalculateNumberPower(x, n - 1);
        }
    }
}
