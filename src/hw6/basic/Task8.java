package hw6.basic;

import java.util.Arrays;

/*
8. Дан массив целых значений. Напишите программу для формирования наибольшего числа из заданного массива целых неотрицательных чисел.

Дано:
[1, 2, 3, 0, 4, 6]
Вывод:
643210
 */
public class Task8 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 0, 4, 6};

//        String[] strArray = new String[array.length];
//        for (int i = 0; i < array.length; i++) {
//            strArray[i] = String.valueOf(array[i]);
//        }
//
//        for (int i = 0; i < strArray.length - 1; i++) {
//            for (int j = i + 1; j < strArray.length; j++) {
//                String s1 = strArray[i] + strArray[j];
//                String s2 = strArray[j] + strArray[i];
//                if (s2.compareTo(s1) > 0) {
//                    String temp = strArray[i];
//                    strArray[i] = strArray[j];
//                    strArray[j] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < strArray.length; i++) {
//            System.out.print(strArray[i]);
//        }


        int k = -1;
        String result = "";

        for (int i = 0; i < array.length; i++) {
            int max = -1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] >= 0 && array[j] > max) {
                    max = array[j];
                    k = j;
                }
            }
            array[k] = -1;
            result += max;
        }

        System.out.println(result);
    }
}
