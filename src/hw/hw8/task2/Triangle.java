package hw.hw8.task2;

import java.util.Objects;

public class Triangle implements Cloneable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return sideA == triangle.sideA && sideB == triangle.sideB && sideC == triangle.sideC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }

    @Override
    protected Triangle clone() throws CloneNotSupportedException {
        return (Triangle) super.clone();
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC;
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

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
}
