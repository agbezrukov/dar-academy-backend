package hw.hw7.basic;

/*
6. Напишите метод для определения площади пятиугольника.
Дано:
Количество сторон: 5
Длина стороны: 6
Ожидаемый результат:
Площадь пятиугольника равна 61,937
 */
public class Task7 {
    public static void main(String[] args) {

        double sizeLength = 6;
        double area = calculateAreaPentagon(sizeLength);

        System.out.printf("Площадь пятиугольника равна %.3f%n", area);
    }

    public static double calculateAreaPentagon(double sizeLength) {
        return (5.0 / 4.0) * Math.pow(sizeLength, 2) / Math.tan(Math.PI / 5);
    }
}
