package hw.hw6.additional;

/*
Напишите программу, которая ищет заданный элемент в двумерном массиве и выводит его координаты (строка и столбец).
 */
public class TaskAdd1 {
    public static void main(String[] args) {
        int n = 20;
        int[][] array = {{10, 20, 30}, {40, 50, 60}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == n) {
                    System.out.println("строка = " + i);
                    System.out.println("столбец = " + j);
                    System.out.println();
                }
            }
        }
    }
}
