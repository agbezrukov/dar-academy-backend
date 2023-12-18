package hw.hw11.task2;

public class EvaluationStudentWork {
    public static void main(String[] args) {

        try {
            System.out.println(divide(56, 7));
            System.out.println(divide(5, 0));

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("y равен нулю");
        }
        return x / y;
    }


}
