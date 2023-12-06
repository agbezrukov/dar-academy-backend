package hw.hw9.additional.task3;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.startEngine();
        Vehicle.Engine engine = vehicle.new Engine();
        engine.run();

    }
}
