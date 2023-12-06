package hw.hw10.task2;

/*
Перечисление должно иметь метод экземпляра boolean isWeekDay() и метод экземпляра boolean isHoliday().
Метод isHoliday() должен возвращать значение, противоположное isWeekDay().
Напишите программу, демонстрирующую использование этого перечисления, в которой есть метод,
принимающий в качестве аргумента Weekday и печатающий сообщение в зависимости от того,
является ли этот Weekday праздничным или нет.
 */
public class WeekdayExample {

    private Weekday weekday;

    public void setWeekday(Weekday weekday) {
        this.weekday = weekday;
    }

    boolean isWeekday() {
        return !((weekday == Weekday.SATURDAY) || (weekday == Weekday.SUNDAY));
    }

    boolean isHoliday() {
        return !isWeekday();
    }

    public void printDayInfo(Weekday weekday) {
        if (isHoliday()) {
            System.out.println(weekday + " is a holiday!");
        } else {
            System.out.println(weekday + " is a weekday.");
        }
    }
}
