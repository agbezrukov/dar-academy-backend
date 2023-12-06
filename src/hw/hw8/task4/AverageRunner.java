package hw.hw8.task4;

/*
Создайте класс с именем 'Average', имеющий метод для вычисления и печати среднего значения.
Напишите программу, чтобы вывести среднее значение трех чисел.
 */
public class AverageRunner {
    public static void main(String[] args) throws CloneNotSupportedException {

        Average average = new Average(3.0, 11.0, 15.0);
        average.printAverage();

        Average average1 = (Average) average.clone();
        average1.printAverage();

        average1.setNumberOne(4.0);
        average1.printAverage();
        average.printAverage();
    }
}
