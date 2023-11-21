package hw.hw7.additional;

/*
Написать метод calculateDistance, который принимает координаты двух точек (x1, y1) и (x2, y2) на плоскости
 и возвращает расстояние между ними.
 */
public class Task7 {

    public static void main(String[] args) {

        int x1 = 1;
        int x2 = 4;
        int y1 = 2;
        int y2 = 6;

        System.out.println(calculateDistance(x1, y1, x2, y2));
    }

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}
