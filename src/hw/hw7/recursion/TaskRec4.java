package hw.hw7.recursion;

/*
  4) Напишите рекурсивную функцию для поиска наибольшего элемента в массиве целых чисел.

 */
public class TaskRec4 {
    public static void main(String[] args) {
        int[] myArray = {3, 55, 7, 12};
        int startIndex = 0;
        int max = myArray[0];
        int maxNumArray = maxNum(myArray, startIndex, max);

        System.out.println(maxNumArray);
    }

    private static int maxNum(int[] myArray, int startIndex, int max) {

        if (startIndex == myArray.length) {
            return max;
        }

        if (myArray[startIndex] > max) {
            max = myArray[startIndex];
        }
        return maxNum(myArray, startIndex + 1, max);
    }
}
