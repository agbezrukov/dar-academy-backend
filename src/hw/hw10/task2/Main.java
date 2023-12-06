package hw.hw10.task2;

/*
Подсказка: метод main может перебирать все значения в перечислении Weekday и передавать их в качестве аргумента методу.
 */
public class Main {
    public static void main(String[] args) {

        WeekdayExample weekdayExample = new WeekdayExample();

        for (Weekday weekday : Weekday.values()) {
            weekdayExample.setWeekday(weekday);
            weekdayExample.printDayInfo(weekday);
        }
    }
}
