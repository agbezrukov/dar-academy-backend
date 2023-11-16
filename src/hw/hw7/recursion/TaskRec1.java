package hw.hw7.recursion;

/*
1) Напишите рекурсивную функцию для печати чисел от 1 до N в порядке возрастания.
 */

import java.util.Scanner;

public class TaskRec1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printToN(n);
        System.out.println();
        printToN(n, 1);
    }

    public static void printToN(int n) {

        if (n > 1) {
            printToN(n - 1);
        }
        System.out.print(n + " ");

    }

    public static void printToN(int n, int i) {

        if (i <= n) {
            System.out.print(i + " ");
            printToN(n, i + 1);
        }
    }

}

