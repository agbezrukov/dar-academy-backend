package hw.hw7.recursion;

/*
5) Напишите рекурсивную функцию для вычисления суммы элементов в массиве целых чисел.
 */
public class TaskRec5 {
    public static void main(String[] args) {
        int[] myArray = {3, 55, 7, 12};
        int startIndex = 0;
        int sum = 0;

        int maxNumArray = sumArray(myArray, startIndex, sum);

        System.out.println(maxNumArray);
    }

    private static int sumArray(int[] myArray, int startIndex, int sum) {

        if (startIndex == myArray.length) {
            return sum;
        }
        sum += myArray[startIndex];

        return sumArray(myArray, startIndex + 1, sum);
    }
}
