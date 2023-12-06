package hw.hw9.basic.task3;

import java.util.Scanner;

public class SquareRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Square square = new Square(scanner.nextDouble());

        System.out.println(square.areaSquare());
        System.out.println(square.perimeterSquare());
        System.out.println(square.diagonalSquare());
    }
}
