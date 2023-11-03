package hw.hw3;

/*
Создайте программу, в которой выполните следующие шаги:
Объявите переменную типа double, но не инициализируйте ее. Присвойте ей значение позже. Перезапишите существующее значение переменной.
Создайте константы со значениями числа PI, ускорения свободного падения, наименования родного города.
Создайте переменные типа byte, short, int, long, double, float, boolean, char, String, и выведите каждое значение в консоль.
 */
public class Task2 {
    static final double PI = 3.14; //значениями числа PI
    static final double G = 9.80665; //ускорения свободного падения
    static final String myCity = "Almaty"; //наименования родного города.

    public static void main(String[] args) {

        double a;

        a = 6.5;
        System.out.println(a);

        a = 7.7;
        System.out.println(a);

        System.out.println(PI);

        System.out.println(G);

        System.out.println(myCity);


        //Создайте переменные типа byte, short, int, long, double, float, boolean, char, String, и выведите каждое значение в консоль.

        byte b = 2;
        short sh = 3;
        int i = 10;
        long l = 10L;
        double d = 2.22;
        float f = 1.2f;
        boolean bo = true;
        char ch = 'A';
        String str = "Hello Anna :)";

        System.out.println(b);
        System.out.println(sh);
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
        System.out.println(bo);
        System.out.println(ch);
        System.out.println(str);
    }
}
