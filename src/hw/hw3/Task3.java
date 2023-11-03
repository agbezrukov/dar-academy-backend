package hw.hw3;

/*
Напишите программу для преобразования типа переменной:
Приведите пример расширяющего приведения
Приведите пример сужающего приведения
 */
public class Task3 {
    public static void main(String[] args) {

        int i1 = 10;
        byte b1 = (byte) i1;
        System.out.println(b1);

        byte b2 = 15;
        int i2 = b2;
        System.out.println(i2);

    }
}
