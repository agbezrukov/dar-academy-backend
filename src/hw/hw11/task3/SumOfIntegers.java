package hw.hw11.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(sumOfIntegers(sc.nextLine()));
        } catch (InputMismatchException e) {
            System.out.println("Строка содержит не только числа");
        }

    }

    private static int sumOfIntegers(String s) {
        Scanner scanner = new Scanner(s);
        int sum = 0;

        while (scanner.hasNext()) {
            sum += scanner.nextInt();
        }

        return sum;
    }
}
