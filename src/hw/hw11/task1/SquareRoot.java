package hw.hw11.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите вещественное число");
            double insert = scanner.nextDouble();

            if (insert <= 0) {
                throw new IllegalArgumentException();
            }

            double squareRoot = Math.sqrt(insert);
            System.out.println("Квадратный корень равен: " + squareRoot);
        } catch (InputMismatchException e) {
            System.out.println("Не верно ввели число");
        } catch (IllegalArgumentException e) {
            System.out.println("Введено отрицательное число либо 0.");
        }
    }
}
