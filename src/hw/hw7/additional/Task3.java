package hw.hw7.additional;
/*
Написать метод isPalindrome, который принимает строку и возвращает true,
если строка является палиндромом (читается одинаково в обоих направлениях), и false в противном случае.
 */
public class Task3 {
    public static void main(String[] args) {

        String str= "abcddcba";

        System.out.println(isPalindrome(str));
    }

    private static Boolean isPalindrome(String str) {
        Boolean result = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = false;
                break;
            }
        }
       return result;
    }
}


