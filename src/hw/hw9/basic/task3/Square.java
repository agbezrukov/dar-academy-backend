package hw.hw9.basic.task3;

import java.util.Objects;

/*
Создайте программу, которая вычисляет площадь, периметр и длину диагонали квадрата со стороной a,
которую ваша программа должна считать из пользовательского ввода с помощью класса Scanner.
 */
public class Square {

    private static final int NUMBER_OF_SQUARE_SIDES = 4;
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double areaSquare() {
        return Math.pow(side, 2.0);
    }

    protected double perimeterSquare() {
        return side * NUMBER_OF_SQUARE_SIDES;
    }

    double diagonalSquare() {
        return Math.round((Math.sqrt(2) * side) * 100.0) / 100.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
}
