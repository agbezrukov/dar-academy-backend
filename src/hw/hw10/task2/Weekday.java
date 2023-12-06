package hw.hw10.task2;

/*
Создайте публичное перечисление Weekday с константами для MONDAY, TUESDAY,... до SUNDAY.
 */
public enum Weekday {
    MONDAY("MONDAY"),
    TUESDAY("TUESDAY"),
    WEDNESDAY("WEDNESDAY"),
    THURSDAY("THURSDAY"),
    FRIDAY("FRIDAY"),
    SATURDAY("SATURDAY"),
    SUNDAY("SUNDAY");

    private String weekday;

    Weekday(String weekday) {
        this.weekday = weekday;
    }
}
