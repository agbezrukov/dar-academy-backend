package hw.hw7.additional;

/*
Написать метод findMax, который принимает массив целых чисел и возвращает максимальный элемент в массиве.
 */
public class Task1 {
    public static void main(String[] args) {

        int[] array = {12, 3, 55, 32, 12, 9};
        int maxNumber = findMax(array);

        System.out.println(maxNumber);
    }

    private static int findMax(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
