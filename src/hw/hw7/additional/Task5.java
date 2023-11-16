package hw.hw7.additional;

/*
Написать перегруженные методы printArray, которые принимают и выводят на экран массив,
независимо от типа (для int[], double[] и char[]).
 */
public class Task5 {
    public static void main(String[] args) {

        int[] intsArray = {5, 11, 98, 43, 78};
        double[] doublesArray = {5.43, 11.11, 98.3, 43.9, 78.4};
        char[] charsArray = {'a', 'c', 'e', 'g', 's', 'k'};

        printArray(intsArray);
        printArray(doublesArray);
        printArray(charsArray);
    }

    private static void printArray(int[] intsArray) {
        System.out.print("Array ints:");
        for (int i : intsArray) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    private static void printArray(double[] doublesArray) {
        System.out.print("Array doubles:");
        for (double d: doublesArray) {
            System.out.print(" " + d);
        }
        System.out.println();
    }

    private static void printArray(char[] charsArray) {
        System.out.print("Array chars:");
        for (char c: charsArray) {
            System.out.print(" " + c);
        }
    }
}
