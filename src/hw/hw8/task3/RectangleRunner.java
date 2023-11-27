package hw.hw8.task3;

/*
Создайте класс 'Rectangle' с полями длины и ширины, переданные в качестве параметров конструктору,
и методом 'returnArea', который возвращает площадь.
Напишите программу для печати площади двух прямоугольников со сторонами (5, 9) и (10, 14) соответственно.
 */
public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 9);
        rectangle.printAreaRectangle();

        Rectangle rectangle2 = new Rectangle(10, 14);
        rectangle2.printAreaRectangle();
    }
}
