package hw6.additional;

/*
Напишите программу, которая находит среднее значение в каждой строке двумерного массива и выводит его.
 */
public class TaskAdd2 {
    public static void main(String[] args) {

        int[][] array = {{10, 20, 30}, {40, 50, 60}};

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            double k = 0;
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
                k++;
            }
            System.out.println("среднее значение строки " + i + " = " + sum / k);
        }
    }
}
