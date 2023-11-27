package hw.hw8.task2;

/*
Создайте класс с именем 'Triangle' с конструктором, параметрами которого будут длины сторон треугольника.
Напишите программу для печати площади и периметра треугольника со сторонами 3, 4 и 5 единиц.
 */
public class TriangleRunner {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3, 4, 5);
        triangle.printAreaTriangle();
        triangle.printPerimeterTriangle();
    }
}
