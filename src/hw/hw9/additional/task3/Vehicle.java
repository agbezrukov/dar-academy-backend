package hw.hw9.additional.task3;

import java.util.Scanner;

/*
Создайте внешний класс Vehicle с внутренним классом Engine.
Внутренний класс должен реализовывать интерфейс Runnable, где метод run будет увеличивать скорость Vehicle.
Внешний класс должен иметь метод для запуска двигателя.
 */
public class Vehicle {
    private boolean engineStarted;

    class Engine implements Runnable {
        @Override
        public void run() {

            int speed = inputSpeed();

            if (engineStarted) {
                for (int i = 0; i <= speed; i += 10) {
                    System.out.println("Speed display: " + i);
                }
            } else {
                System.out.println("Engine not started");
            }

        }
    }

    public void startEngine() {
        engineStarted = true;
        System.out.println("Engine is starting...");
    }

    int inputSpeed() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Increase the speed to: ");
        return sc.nextInt();
    }
}
