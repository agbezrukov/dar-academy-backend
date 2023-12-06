package hw.hw8.task4;

import java.util.Objects;

public class Average implements Cloneable {

    private double numberOne;
    private double numberTwo;
    private double numberThree;

    public Average(double numberOne, double numberTwo, double numberThree) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
    }

    private double returnAverage() {
        return (numberOne + numberTwo + numberThree) / 3;
    }

    public void printAverage() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Среднее число = %.2f", returnAverage());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Average average = (Average) o;
        return Double.compare(average.numberOne, numberOne) == 0 && Double.compare(average.numberTwo, numberTwo) == 0 && Double.compare(average.numberThree, numberThree) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOne, numberTwo, numberThree);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public double getNumberThree() {
        return numberThree;
    }

    public void setNumberThree(double numberThree) {
        this.numberThree = numberThree;
    }
}
