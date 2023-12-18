package hw.hw10.task3;

public class TransportRunner {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", 200, 2300.9);
        car1.Show();
        System.out.println(car1.isEngine());
        car1.setEngine(true);
        System.out.println(car1.isEngine());
    }
}
