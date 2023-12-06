package hw.hw8.task3;

import java.util.Objects;

public class Rectangle {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    private int returnArea() {
        return sideA * sideB;
    }

    public void printAreaRectangle() {
        System.out.println(this);
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return String.format("Площадь прямоугольника: %s", returnArea());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return sideA == rectangle.sideA && sideB == rectangle.sideB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

    @Override
    protected Rectangle clone() throws RuntimeException {
        return new Rectangle(sideA, sideB);
    }
}
