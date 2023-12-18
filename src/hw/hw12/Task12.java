package hw.hw12;

//Number of Steps to Reduce a Number to Zero https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class Task12 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            num = num % 2 == 0 ? num / 2 : num - 1;
            count++;
        }
        return count;
    }
}
