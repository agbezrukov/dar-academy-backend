package hw.hw10.task2;

/*
Создайте публичное перечисление Weekday с константами для MONDAY, TUESDAY,... до SUNDAY.
 */
public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static boolean isWeekday(Weekday weekday) {
        return !((weekday == Weekday.SATURDAY) || (weekday == Weekday.SUNDAY));
    }

    public static boolean isHoliday(Weekday weekday) {
        return !isWeekday(weekday);
    }
}
