package hw.hw8.task4;
/*
Создайте класс с именем 'Average', имеющий метод для вычисления и печати среднего значения.
Напишите программу, чтобы вывести среднее значение трех чисел.
 */
public class AverageRunner {
    public static void main(String[] args) {

        Average average = new Average(3.0,11.0,15.0);
        average.printAverage();
    }
}
