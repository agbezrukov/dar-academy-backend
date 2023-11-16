package hw.hw7.additional;

/*
Написать метод findGCD, который принимает два целых числа и возвращает их НОД.
 */
public class Task4 {
    public static void main(String[] args) {
        int num1 = 28;
        int num2 = 64;

        System.out.println(findGCD(num1, num2));
    }

    private static int findGCD(int num1, int num2) {

        int gcd = 0;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
