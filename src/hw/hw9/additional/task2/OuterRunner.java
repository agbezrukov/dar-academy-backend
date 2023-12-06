package hw.hw9.additional.task2;

public class OuterRunner {
    public static void main(String[] args) {

        Outer.Inner inner = new Outer(5).new Inner();
        inner.incrementsNumberByOne();
    }
}
