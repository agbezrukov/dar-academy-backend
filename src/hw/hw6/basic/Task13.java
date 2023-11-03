package hw.hw6.basic;
/*
13. Напишите программу, которая возвращает максимальное и минимальное значение, найденные в двумерном массиве.

Дано:
10 20 30
40 50 60

Вывод:
Максимальный элемент = 60
Минимальный элемент = 10
 */
public class Task13 {
    public static void main(String[] args) {

        int [][] arrays = {{10,20,30},{40,50,60}};
        int maxNum = arrays[0][0];
        int minNum = maxNum;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
//                System.out.println(arrays[i][j]);
                if (arrays[i][j] > maxNum ){
                    maxNum =arrays[i][j];
                }
                if (minNum > arrays[i][j] ){
                    minNum =arrays[i][j];
                }
            }
        }

//        int minNum = maxNum;
//        for (int i = 0; i < arrays.length; i++) {
//            for (int j = 0; j < arrays[i].length; j++) {
//                if (minNum > arrays[i][j] ){
//                    minNum =arrays[i][j];
//                }
//            }
//        }
        System.out.println("Вывод:");
        System.out.println("Максимальный элемент = " + maxNum);
        System.out.println("Минимальный элемент = " + minNum);
    }
}
