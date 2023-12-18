package hw.hw12;

//Sum of All Odd Length Subarrays https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
public class Task14 {
    public static void main(String[] args) {

        int[] array = {1, 4, 2, 5, 3};

        System.out.println(sumOddLengthSubarrays(array));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if ((j - i + 1) % 2 != 0) {
                    result += sum;
                }
            }
        }

        return result;
    }
}
