package hw.hw8.task3;

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

    @Override
    public String toString() {
        return String.format("Площадь прямоугольника: %s", returnArea());
    }
}
