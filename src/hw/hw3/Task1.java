package hw.hw3;

/*
Создайте программу, в которой выполните следующие шаги:
Создайте переменную с именем flowersName и присвойте ей значение Roses.
Создайте переменную с именем flowersNumber и присвойте ей значение 101.
Выведите значения переменных flowersName и flowersNumber в консоль.
Выведите на экран сумму 15 + 10, используя две переменные: a и b.
Создайте переменную c, присвойте ей a + b и выведите результат.
Создайте три переменные одного типа, используя список, разделенный запятыми, и присвойте им разными значения. Выведите сумму трех переменных в консоль.
Создайте четыре переменных одного типа, используя список, разделенный запятыми,  и присвойте им одно значение. Выведите сумму четырех переменных в консоль.

 */
public class Task1 {
    public static void main(String[] args) {

        String flowersName = "Roses";
        int flowersNumber = 101;
        System.out.println(flowersName);
        System.out.println(flowersNumber);

        int a = 15, b = 10;
        System.out.println(a + b);

        int c = a + b;
        System.out.println(c);

        int d = 3, e = 5, f = 7;
        int sum1 = d + e + f;
        System.out.println(sum1);

        int g, j, k, l;
        g = j = k = l = 50;
        int sum2 = g + j + k + l;
        System.out.println(sum2);
    }
}
