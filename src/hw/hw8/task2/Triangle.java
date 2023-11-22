package hw.hw8.task2;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void printAreaTriangle() {
        double p = (sideA + sideB + sideC) / 2.0;  // полупериметр
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        System.out.println("Площадь треугольника = " + area);
    }

    public void printPerimeterTriangle() {
        System.out.println("Периметр треугольника = " + (sideA + sideB + sideC));
    }
}
