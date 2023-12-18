package hw.hw12;

import java.util.Arrays;

//Check If Two String Arrays are Equivalent https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class Task13 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}
