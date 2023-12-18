package hw.hw10.task3;

public abstract class Transport {
    private String stamp;//марка
    private int maxSpeed;//скорость
    private double carry;//грузоподъёмность

    public Transport(String stamp, int maxSpeed, double carry) {
        this.stamp = stamp;
        this.maxSpeed = maxSpeed;
        this.carry = carry;
    }

    public abstract void Show();

    public String getStamp() {
        return stamp;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getCarry() {
        return carry;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCarry(float carry) {
        this.carry = carry;
    }
}
