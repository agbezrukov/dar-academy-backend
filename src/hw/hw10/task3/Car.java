package hw.hw10.task3;

public class Car extends Transport implements EngineStartable {
    private boolean engine; // номер

    public Car(String stamp, int maxSpeed, double carry) {
        super(stamp, maxSpeed, carry);
        this.engine = false;
    }

    @Override
    public void startEngine() {
        this.engine = true;
    }

    @Override
    public void Show() {
        System.out.println("Car { stamp = " + getStamp() + ", maxSpeed = " + getMaxSpeed() + ", carry = " + getCarry() +
                ", engine = " + engine + '}');
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }
}
