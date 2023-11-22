package hw.hw8.task4;

public class Average {

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
}
