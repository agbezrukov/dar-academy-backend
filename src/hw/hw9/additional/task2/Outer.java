package hw.hw9.additional.task2;

/*
Создайте внешний класс Outer с приватным членом int number.
Внутри Outer создайте внутренний класс Inner, который увеличивает значение number внешнего класса на 1 и выводит новое значение.
 */
public class Outer {

    private int number;

    public Outer(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    class Inner {
        void incrementsNumberByOne() {
            System.out.println(++number);
        }
    }
}
