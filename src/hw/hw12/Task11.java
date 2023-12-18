package hw.hw12;

//Palindrome number https://leetcode.com/problems/palindrome-number/
public class Task11 {
    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversInt = 0;
        int originalInt = x;

        while (x > 0) {
            int digit = x % 10;
            reversInt = reversInt * 10 + digit;
            x /= 10;
        }

        return originalInt == reversInt;
    }
}
