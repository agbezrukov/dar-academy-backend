package hw.hw5;

/*
Дано целое положительное число. Напишите программу, которая выводит сообщение о том, является ли это число простым.
 */
public class Task5 {
    public static void main(String[] args) {

        int n = 3;
        boolean prime = true;

        for (int i = 2; i < n; i++) {

            if ((n % i) == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println("число простое");
        } else {
            System.out.println("число не простое");
        }
    }
}
