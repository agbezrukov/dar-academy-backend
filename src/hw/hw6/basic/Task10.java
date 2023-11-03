package hw.hw6.basic;
/*
10. Напишите программу, которая возвращает сумму всех значений в двумерном массиве.

Дано:
10 20 30
40 50 60
Вывод:

Сумма = 210
 */
public class Task10 {
    public static void main(String[] args) {

        int [][] array = {{10,20,30},{40,50,60}};
int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
            sum += array[i][j];
            }
        }

        System.out.println("Сумма = " + sum);
    }
}
