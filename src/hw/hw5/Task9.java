package hw.hw5;

/*
9. Дано целое положительное число n. Напишите программу для печати ряда Фибоначчи из n членов:

0 1 1 2 3 5 8 13 21 .....
 */
public class Task9 {
    public static void main(String[] args) {
        int p1 = 0;
        int p2 = 1;

        int n = 15;

        for (int i = 0; i < n; i++) {
            int p3 = p2;
            p2 += p1;
            System.out.println(p1);
            p1 = p3;
        }
    }
}
