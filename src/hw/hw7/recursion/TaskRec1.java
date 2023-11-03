package hw.hw7.recursion;

/*
1) Напишите рекурсивную функцию для печати чисел от 1 до N в порядке возрастания.
 */

public class TaskRec1 {
    public static void main(String[] args) {

        int n = 10;

        printNumbers(n);
    }

    public static void printNumbers(int n) {

        if (n > 1) {
            printNumbers(n - 1);
        }

        System.out.print(n + " ");
    }

}

